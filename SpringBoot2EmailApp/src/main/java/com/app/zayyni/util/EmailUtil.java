package com.app.zayyni.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender sender;//HAS-A
	
	public boolean  send(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			Resource file) 
	{
		boolean flag = false;
		try {
			
			//1. Create Empty Message
			MimeMessage message =  sender.createMimeMessage();
			//2. Use helper class object -> message is attachment exist?
			MimeMessageHelper helper = new MimeMessageHelper(message,file!=null?true:false);
			
			//set details
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			
			if(cc!=null && cc.length>0) {
				helper.setCc(cc);
			}
			if(bcc!=null && bcc.length>0) {
				helper.setCc(bcc);
			}
			if(file!=null) {
				helper.addAttachment(file.getFilename(), file);
			}

			System.out.println("This is mail message: "+message);
			//3. send message object
			sender.send(message);
			
			flag = true; //success
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		
		return flag;
	}
}

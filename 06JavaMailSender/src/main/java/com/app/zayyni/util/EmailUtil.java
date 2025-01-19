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
	private JavaMailSender sender; //HAS A
	
	public boolean send(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			Resource file) {
		boolean flag = true;
		
		try {
			
			//1. Create empty message
			
			MimeMessage message = sender.createMimeMessage();
			
			//2. User helper call object -> message, isAttachmentExist?
			
			MimeMessageHelper helper = new MimeMessageHelper(message, file!=null?true:false);
			
			//set details
			
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(text);
			
			if(cc!=null && cc.length>0) {
				helper.setCc(cc);
			}
			
			if(bcc!=null && bcc.length>0) {
				helper.setBcc(bcc);
			}
			if(file!=null) {
				helper.addAttachment(file.getFilename(), file);
			}
			
			//3. Send email
			sender.send(message);
			
			flag = true; //success
			
		} catch (Exception e) {
			flag = false; //fail
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		return flag;
		
	}
}

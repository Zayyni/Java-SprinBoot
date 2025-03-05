package com.app.zayyni.service;

import java.io.ByteArrayOutputStream;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.app.zayyni.bean.Ticket;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Service
public class MovieTicketGeneratorServiceImpl implements MovieTicketGeneratorService{
	
	@Autowired
	private ObjectMapper mapper;
	
	@Value("${movie.trailer-url}")
	private String  movie_trailer_url;

	@Override
	public byte[] generateMovieTicket(Ticket movieTicket) throws Exception {
		
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		
		movieTicket.setTicketNumber(UUID.randomUUID().toString());
		
		movieTicket.setTrailerUrl(movie_trailer_url);
		// Log the Ticket object before serialization
        System.out.println("Ticket before serialization: " + movieTicket);
		
		String movieTicketData = mapper.writeValueAsString(movieTicket);
		
		// Log the JSON data
        System.out.println("Serialized Ticket JSON: " + movieTicketData);
		
		BitMatrix bitMatrix = qrCodeWriter.encode(movieTicketData, BarcodeFormat.QR_CODE, 150, 150);

		ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
		MatrixToImageConfig con = new MatrixToImageConfig(0xFF000002, 0xFFFFC041);

		MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream, con);
//		byte[] pngData = pngOutputStream.toByteArray();
//		
//		return pngData;
		
		return pngOutputStream.toByteArray();
	}

}

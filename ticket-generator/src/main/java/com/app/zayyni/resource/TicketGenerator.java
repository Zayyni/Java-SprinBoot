package com.app.zayyni.resource;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


import com.app.zayyni.bean.Ticket;
import com.app.zayyni.service.MovieTicketGeneratorService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
public class TicketGenerator {
	
	@Autowired
	private MovieTicketGeneratorService service;
	
	@PostMapping("/movie-tickets")
	public void createMovieTicket(@RequestBody Ticket movieTicket, HttpServletResponse response) {
		Map<Integer, String> respMap = new HashMap<Integer, String>();
		 response.setContentType("image/png");
		try {
			 // Log the received payload for debugging
            System.out.println("Received Ticket: " + movieTicket);
			byte[] ticket = service.generateMovieTicket(movieTicket);
			 OutputStream outputStream = response.getOutputStream();
			 outputStream.write(ticket);
			//return ResponseEntity.ok(ticket);
		}catch (Exception e) {
			respMap.put(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Server is Too Busy!! Try Again");
			//return ResponseEntity.internalServerError().body(respMap);
		}
	}
	
	@PostMapping("/test-ticket")
	public Ticket testTicket(@RequestBody Ticket movieTicket) {
	    System.out.println("Received Ticket: " + movieTicket);
	    
	    if (movieTicket == null) {
	        System.out.println("Deserialization failed! Received a null object.");
	    }

	    return movieTicket;
	}


}

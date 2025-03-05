package com.app.zayyni.service;
import com.app.zayyni.bean.Ticket;

public interface MovieTicketGeneratorService {
	
	public byte[] generateMovieTicket(Ticket movieTicket) throws Exception;

}

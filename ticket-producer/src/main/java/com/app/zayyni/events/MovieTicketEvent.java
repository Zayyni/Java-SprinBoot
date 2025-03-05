package com.app.zayyni.events;

import lombok.Data;

@Data
public class MovieTicketEvent {

	private static final long serialVersionUID = -6342872689032749808L;
	private String ticketNumber;
	private String movieName;
	private String showTime;
	private String trailerUrl;
	private String customerName;
	private String email;
	private String mobileNumber;
	private String ticketStatus;
}

package com.app.zayyni.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Ticket implements Serializable {
	
	private static final long serialVersionUID = -930377527450912535L;

    private String ticketNumber;
    private String movieName;
    private String showTime;
    private String trailerUrl;
    private String customerName;
    private String mobileNumber;
    private String email;
	
	
}

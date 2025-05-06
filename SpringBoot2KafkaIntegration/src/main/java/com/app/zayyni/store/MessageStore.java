package com.app.zayyni.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {

	private List<String> list = new ArrayList<>();
	
	public void add(String message) {
		list.add(message);
	}
	
	public String getAll() {
		return list.toString();
	}
}

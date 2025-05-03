package com.app.zayyni.util;

import java.io.FileInputStream;

public class DataUtil {

	public static String[] getData() {
		String[] arr = null;
		try {
			FileInputStream fis = new FileInputStream("F:\\servers iptv.txt");
			byte[] bytes = new byte[fis.available()];
			fis.read(bytes);
			
			String message = new String(bytes);
			fis.close();
			
			arr = message.split(" ");	

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}

}

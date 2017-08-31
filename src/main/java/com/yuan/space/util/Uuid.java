package com.yuan.space.util;

import java.util.UUID;

public class Uuid {
	public static String getUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void main(String[] args) {
		String a = System.getProperty("webapp.root");
		System.out.println(a);
	}
}

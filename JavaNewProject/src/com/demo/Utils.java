package com.demo;

public class Utils {
	public static void printMessage(Object message) {
		System.out.println(Thread.currentThread().getName()+"-"+message.toString());
	}
}

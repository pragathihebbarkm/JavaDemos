package com.demo;

public class Utils {
	public static void printMessage(String message) {
		System.out.println(Thread.currentThread().getName()+"-"+message);
	}
}

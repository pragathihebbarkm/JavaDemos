package com.demo;

public class SwitchDemo {
	public static void main(String[] args) {
		
		int userOption =7;
		
		switch(userOption) {
		case 1: System.out.println("main menu");
		break;
		case 2: System.out.println("existing customer");
		break;
		case 3: System.out.println("new customer");
		break;
		default: System.out.println("select a valid option");
		}
	}
}

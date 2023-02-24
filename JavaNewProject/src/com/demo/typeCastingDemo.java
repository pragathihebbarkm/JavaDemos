package com.demo;

public class typeCastingDemo {
	byte b =100;
	int i =95;
	char c ='x';
	
	public static void main(String[] args) {
		typeCastingDemo tcobj = new typeCastingDemo();
		//explicit casting
		tcobj.b=(byte) tcobj.i;
		System.out.println(tcobj.b);
		tcobj.b=(byte) tcobj.c;
		System.out.println(tcobj.b);
		tcobj.c=(char) tcobj.i;
		System.out.println(tcobj.c);
		tcobj.c=(char) tcobj.b;
		System.out.println(tcobj.c);
		
		//implicit casting
		tcobj.i=tcobj.c;
		System.out.println(tcobj.i);
		
		
		
		
	}
}

package com.demo;

public class dataTypesDemo {

	byte a = 50;
	static byte b = 78;
	short s = 150;
	float f = 123.23f;
	double d = 123213.4321;
	char c = 's';
	long l = 88;
	
	public static void main(String[] args) {
		dataTypesDemo dobj = new dataTypesDemo();
		System.out.println(dobj.a);
		System.out.println(b);
		System.out.println(dobj.s);
		System.out.println(dobj.f);
		System.out.println(dobj.d);
		System.out.println(dobj.c);
		System.out.println();
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
	}
	
}

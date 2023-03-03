package com.demo;

public class DeadlockDemo {

}

class FirstResource {
	
	public synchronized void method1(SecondResource sr) {
		
	}
}

class SecondResource {
	
}
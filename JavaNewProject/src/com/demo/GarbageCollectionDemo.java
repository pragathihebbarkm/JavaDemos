package com.demo;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		for(int i =0; i< 100000; i++) {
			new House(i);
		}
	}
}

class House {
	int id;
	House(int id){
		this.id = id;
		Utils.printMessage("House created"+id);
	}
	
	@Override
	protected void finalize() throws Throwable{
		Utils.printMessage("House destroyed"+id);
	}
}
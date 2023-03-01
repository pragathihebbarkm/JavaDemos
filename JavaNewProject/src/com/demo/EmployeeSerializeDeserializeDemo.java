package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializeDeserializeDemo {

	int id;
	String name;
	double salary;
	private String aadhar;
	
	public static void main(String[] args) {
		
		//DeserializeDemo();
		SerializeDemo();
	}
	
	public EmployeeSerializeDeserializeDemo(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	private static void DeserializeDemo() {
		
		try(FileInputStream fis = new FileInputStream("C:\\Demo\\EmployeeSerializeDeserializeDemo.src");
				ObjectInputStream oos = new ObjectInputStream(fis);){
			
			EmployeeSerializeDeserializeDemo emp = new EmployeeSerializeDeserializeDemo(1, "max", 23400);
			System.out.println("object deserialized"+ emp);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private static void SerializeDemo() {
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Demo\\EmployeeSerializeDeserializeDemo.src");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			EmployeeSerializeDeserializeDemo emp1 = new EmployeeSerializeDeserializeDemo(1,"Max",8000);
			oos.writeObject(emp1);
			System.out.println("object serialized");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

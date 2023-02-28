package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) {
		//fileInputStreamDemo();
		//fileOutputStreamDemo();
		//fileWriterDemo();
		BufferedreaderDemo();
	}
	
	 private static void fileInputStreamDemo() {
		 int i;
		 File myfile = new File("C:\\Demo\\file1.txt");
		 
		 try {
			FileInputStream fis = new FileInputStream(myfile);
			
			try {
				while((i=fis.read())!=-1) {
					System.out.println((char)i);
				}
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	 }
	 
	 static void fileOutputStreamDemo()  {
		 int i;
		 File myfile = new File("C:\\Demo\\file1.txt");
		 
		 try {
			FileOutputStream fos = new FileOutputStream(myfile);
			
			String data = "hi there";
			byte dataarray[] = data.getBytes();
			try {
				fos.write(dataarray);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
	 }
	 
	 static void BufferedreaderDemo() {
		 String line;
		 File myfile = new File("C:\\Demo\\file1.txt");
		 
		 try {
			FileReader fis = new FileReader(myfile);
			BufferedReader br = new BufferedReader(fis);
			
		
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
				fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 static void fileWriterDemo()  {
		 int i;
		 File myfile = new File("C:\\Demo\\file1.txt");
		 
		 try {
			FileWriter fw = new FileWriter(myfile);
			
			fw.write("hello");
			
			fw.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	 }
}

package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i=1; i<=10;i++) {
			intList.add(i);
		}
		System.out.println(intList);
		
		List<Integer> filteredList = intList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filteredList);
		
		List<Integer> mulBy2List = intList.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(mulBy2List);
		
		List<String> names = new ArrayList<>();
		names.add("SITHA");
		names.add("VAIDEHI");
		names.add("JANAKI");
		names.add("MYTHILI");
		List<String> lowerCaseList = names.stream().map(i->(i.toLowerCase())).collect(Collectors.toList());
		System.out.println(lowerCaseList);
	}
}

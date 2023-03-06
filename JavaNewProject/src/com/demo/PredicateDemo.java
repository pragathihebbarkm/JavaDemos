package com.demo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> gt20 = (i) -> (i>20);
		System.out.println("is 15>20:"+gt20.test(15));
		
		Predicate<String> stringLengthGreaterThan5 = (s)->(s.length()>5);
		System.err.println("Hello > 5"+stringLengthGreaterThan5.test("Hello"));
		
		Predicate<Integer> gt10 = (i) -> (i>10);
		int[] x = {0,10,20,30,40};
		m1(gt10,x);
		
		System.out.println("-----------");
		
		Predicate<Integer> evenNums = (i) -> (i%2==0);
		Predicate<Integer> gt5 = (i) -> (i>5);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		EvenNumbers(gt5.and(evenNums),arr);
	}
	
	static void m1(Predicate<Integer> p, int[] x) {
		for(int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
	static void EvenNumbers(Predicate<Integer> p, int[] num) {
		for(int i : num) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}

package com.java.testeq;

import java.util.HashSet;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Student s1=new Student(1, "Test", 123);

		Student s2=new Student(2, "Data", 456);

		Student s3=new Student(1, "Test", 123);
		System.out.println(s1.equals(s3));
		
		Set<String> set=new HashSet<>();
		set.add("Java");
		set.add("JPA");
		set.add("Spring");
		set.add("Java");
		System.out.println(set);
		
	}
}

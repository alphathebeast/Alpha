package com.setdemo;

public class Student implements Comparable<Object> {

	String name;
	float marks;
	float height;

	public Student(String name, float marks, float height) {
		this.name = name;
		this.marks = marks;
		this.height = height;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.marks < s.marks) {
			return -75;
		} else if (this.marks > s.marks) {
			return 85;
		} else {
			return 0;
		}
	}
}

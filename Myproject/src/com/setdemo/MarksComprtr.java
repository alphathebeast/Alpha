package com.setdemo;

import java.util.Comparator;

public class MarksComprtr implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.marks < s2.marks) {
			return 8;

		} else if (s1.marks > s2.marks) {
			return -89;
		} else {
			return 0;
		}
	}

}

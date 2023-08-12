package com.setdemo;

import java.util.Comparator;

public class NCCComprtr implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.height < s2.height) {
			return -85;
		} else if (s1.height > s2.height) {
			return 59;
		} else {
			return 0;
		}

	}

}

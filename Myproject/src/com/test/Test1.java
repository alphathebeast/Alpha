package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		String s = "562sbha154saf7dc13s";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(s);
		while (m.find()) {
			int i = Integer.parseInt(m.group());
			System.out.print(i + ", ");
		}
	}
}
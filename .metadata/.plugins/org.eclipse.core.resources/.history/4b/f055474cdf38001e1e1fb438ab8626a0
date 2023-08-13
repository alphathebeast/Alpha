package com.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your code for getting mobile number: ");
		int x = sc.nextInt();
		sc.close();
		switch (x) {
		case 1:
			yash_mb_no();
			break;
		case 2:
			sapana_mb_no();
			break;
		default:
			break;
		}
	}

	public static void yash_mb_no() {
		String s = "7387745895";
		call(s);
	}
	
	public static void sapana_mb_no() {
		String s = "8669895060";
		call(s);
	}

	public static String call(String s) {
		char ch;
		System.out.print("Your mobile number is: ");
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			System.out.print(ch);
		}
		return s;
	}

}

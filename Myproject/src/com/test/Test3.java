package com.test;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse it: ");
		String s = scan.nextLine();
		scan.close();
	
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		System.out.println(sb);
	}
}

package programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to reverse it: ");
		String s = sc.nextLine();
		sc.close();
		char ch;
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			rev = ch + rev;
		}
		if (s.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}


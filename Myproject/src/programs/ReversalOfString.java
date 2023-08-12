package programs;

import java.util.Scanner;

public class ReversalOfString {
	public static void main(String[] args) {
		ReversalOfString.revUsingSB();
	}

	public static void revUsingSB() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string for reversal: ");
		String s = scan.nextLine();
		scan.close();
		StringBuffer x = new StringBuffer(s);
		StringBuffer str = x.reverse();
		System.out.println(str);
	}

	public static void revUsingNormalMethods() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you string to reverse it: ");
		String s = sc.nextLine();
		sc.close();
		char ch;
		String rev = "";
		System.out.println("Befor reversal: " + s);
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			rev = ch + rev;
		}
		System.out.println("After Reversal: " + rev);
	}
}

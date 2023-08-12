package pacakagea;

import java.util.Scanner;

public class NumberofWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to find out the number of words.");
		String s = sc.nextLine();
		sc.close();
		System.out.println("Number of words int he given string are: " + s.split(" ").length);
	}
}
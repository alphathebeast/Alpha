package programs;

import java.util.Scanner;

public class NoOfWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("To find the number of words, please enter your string here: ");
		String s = sc.nextLine();
		sc.close();
		String[] str = s.trim().split(" ");
		System.out.println("The number of words in your string are:  " + str.length);
	}
}

package programs;

import java.util.Scanner;

public class Multiplication_Tables {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see its multiplication table");

		int num = scan.nextInt();
		scan.close();

		System.out.println("The multiplication table of " + num + " is:");
		System.out.println("---------------------------------");

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " X " + i + " = " + (num * i));

		}

		System.out.println("---------------------------------");
	}
}

package programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find is factorial: ");
		int num = scan.nextInt();
		int fac = 1;
		scan.close();
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}

		System.out.println("factorial is: " + fac);
		
	}
}
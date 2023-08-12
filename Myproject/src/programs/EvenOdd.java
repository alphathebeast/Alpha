package programs;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		evenNumbers();
		oddNumbers();
		checkEvenOrOdd();

	}

	public static void evenNumbers() {
		int x = 1;
		System.out.print("The even numbers are:");
		while (x <= 11) {
			if (x % 2 == 0) {
				System.out.print(" " + x);
			}
			x++;
		}
		System.out.println();
	}

	public static void oddNumbers() {
		int x = 1;
		System.out.print("The odd numbers are:");
		while (x <= 11) {
			if (x % 2 != 0) {
				System.out.print(" " + x);
			}
			x++;
		}
		System.out.println();
	}

	public static void checkEvenOrOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is even or odd: ");
		int x = sc.nextInt();
		sc.close();
		if (x % 2 == 0) {
			System.out.println("it is an even number");
		} else {
			System.out.println("it is an odd number");
		}
	}
}

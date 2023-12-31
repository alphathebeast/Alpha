package programs;

import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();
		if (isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}
	}
	// Function to check if a number is an Armstrong number
	public static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int numberOfDigits = String.valueOf(num).length();

		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, numberOfDigits);
			num /= 10;
		}
		return sum == originalNum;
	}
}
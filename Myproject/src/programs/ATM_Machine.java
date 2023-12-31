package programs;

import java.util.Scanner;

public class ATM_Machine {

	@SuppressWarnings("resource")
	public static void cardBlocked() {
		int balance = 50000;
		int pin = 1234;
		int count = 0;
		while (count < 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your pin number: ");
			int x = sc.nextInt();
			if (x == pin) {
				System.out.println("Enter the amount you want to withdraw: ");
				int y = sc.nextInt();
				balance = balance - y;
				if (balance < 0) {
					System.err.println("Insufficient balance: " + balance);
					break;
				} else {
					System.out.println("withdraw successful");
					System.out.println("Your balance is: " + balance);
					break;
				}
			} else {
				System.err.println("Invalid pin entered! " + x);
				System.err.println("please try again !");
				count++;
				if (count == 3) {
					System.err.println("Your card is blocked !");
					System.err.println("Kindly visit your nearest branch");
				}
			}
		}
	}

	public static void main(String[] args) {
		cardBlocked();
	}
}

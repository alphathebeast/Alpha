package programs;

import java.util.Scanner;

public class ReadNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two digit number: ");
		int x = scan.nextInt();
		scan.close();
		int y = x % 10;
		int z = x / 10;
		int lastDigit = y;
		int firstDigit = z % 10;
		switch (firstDigit) {
		case 0:
			System.out.print("ZERO ");
			break;
		case 1:
			System.out.print("ONE ");
			break;
		case 2:
			System.out.print("TWO ");
			break;
		case 3:
			System.out.print("THREE ");
			break;
		case 4:
			System.out.print("FOUR ");
			break;
		case 5:
			System.out.print("FIVE ");
			break;
		case 6:
			System.out.print("SIX ");
			break;
		case 7:
			System.out.print("SEVEN ");
			break;
		case 8:
			System.out.print("EIGHT ");
			break;
		case 9:
			System.out.print("NINE ");
			break;
		}

		switch (lastDigit) {
		case 0:
			System.out.print("ZERO ");
			break;
		case 1:
			System.out.print("ONE ");
			break;
		case 2:
			System.out.print("TWO ");
			break;
		case 3:
			System.out.print("THREE ");
			break;
		case 4:
			System.out.print("FOUR ");
			break;
		case 5:
			System.out.print("FIVE ");
			break;
		case 6:
			System.out.print("SIX ");
			break;
		case 7:
			System.out.print("SEVEN ");
			break;
		case 8:
			System.out.print("EIGHT ");
			break;
		case 9:
			System.out.print("NINE ");
			break;
		}
	}
}

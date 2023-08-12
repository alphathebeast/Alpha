package programs;

import java.util.Scanner;

public class Calculator {
	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public float div(float x, float y) {
		return x / y;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("===============MENU===============");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("==============XXXXXX===============");
		int choice = sc.nextInt();
		sc.close();

		switch (choice) {

		case 1:
			int sum = c.add(a, b);
			System.out.println("The addittion is: " + sum);
			break;

		case 2:
			int dif = c.sub(a, b);
			System.out.println("The substraction is: " + dif);
			break;

		case 3:
			int mul = c.mul(a, b);
			System.out.println("The multiplication is: " + mul);
			break;

		case 4:
			float div = c.div(a, b);
			System.out.println("The division is: " + div);
			break;

		default:
			System.out.println("Invalid choice entered, please try again :)");
			break;
		}
	}
}

package programs;

import java.util.Random;

public class Four_Digit_Random_Numbers {

	public static void main(String[] args) {

		Random random = new Random();

		int randomNumbers = random.nextInt(9000) + 1000;

		System.out.println("Four digit random number is: " + randomNumbers);

	}
}

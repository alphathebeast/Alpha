package programs;

public class Pattern_2 {
	public static void main(String[] args) {

		int no_of_rows = 5;
		for (int i = 0; i < no_of_rows; i++) {
			for (int j = 2 * (no_of_rows - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

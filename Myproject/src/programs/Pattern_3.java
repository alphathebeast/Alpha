package programs;

public class Pattern_3 {
	public static void main(String[] args) {
		int rows = 5;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= rows - i; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}

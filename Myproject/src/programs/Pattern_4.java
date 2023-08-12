package programs;

public class Pattern_4 {
	public static void main(String[] args) {
		int rows = 5;
		int i = rows - 1;
		while (i >= 0) {
			int alpha = 65;
			int j = 0;
			while (j <= i) {
				System.out.print((char) (alpha + j) + " ");
				j++;
			}
			System.out.println();
			i--;
		}

		i = 1;
		while (i < rows) {
			int alpha = 65;
			int j = 0;
			while (j <= i) {
				System.out.print((char) (alpha + j) + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

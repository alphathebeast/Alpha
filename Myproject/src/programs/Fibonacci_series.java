package programs;

public class Fibonacci_series {
	public static void main(String[] args) {
		int n = 10;
		generateFibonacciSeries(n);
	}

	public static void generateFibonacciSeries(int n) {
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		System.out.println("Fibonacci Series:");
		for (int num : fibonacci) {
			System.out.print(num + " ");
		}
	}
}


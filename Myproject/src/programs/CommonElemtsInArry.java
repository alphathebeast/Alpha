package programs;

import java.util.ArrayList;

public class CommonElemtsInArry {
	public static void main(String[] args) {
		int[] x = { 12, 4, 5, 8, 53, 17 };
		int[] y = { 11, 45, 2, 8, 53, 1, 17, 19, 40 };

		ArrayList<Integer> ax = new ArrayList<Integer>();
		ArrayList<Integer> ay = new ArrayList<Integer>();

		for (int i = 0; i < x.length; i++) {
			ax.add(x[i]);
		}

		for (int j = 0; j < y.length; j++) {
			ay.add(y[j]);
		}

		ax.retainAll(ay);

		System.out.println("common elements in array are: " + ax);
	}
}

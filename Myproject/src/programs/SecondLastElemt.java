package programs;

import java.util.TreeSet;

public class SecondLastElemt {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		int[] x = { 17, 45, 28, 12, 73, 65, 15, 63};
		TreeSet ts = new TreeSet();
		
		for (int i = 0; i < x.length; i++) {
			ts.add(x[i]);
		}
		System.out.println(ts);
		System.out.println("Second last element of the Array is: "+ts.lower(ts.last()));
	}
}

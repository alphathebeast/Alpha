package pacakagea;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMAPdemo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		hm.put(6, "F");

		// Print values using for loop
		Set<Integer> keys = hm.keySet();
		System.out.println("Printing values using for loop");
		for (int key : keys) {
			System.out.println(hm.get(key));
		}

		// Print keys and values both
		Set<Map.Entry> entries = hm.entrySet();
		System.out.println("Printing both keys and values");
		for (Map.Entry entry : entries) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		// Print values using Iterator
		Iterator itr = keys.iterator();
		System.out.println("Values printed using iterator");
		while (itr.hasNext()) {
			System.out.println(hm.get(itr.next()));
		}

		// Print key and value using iterator
		Iterator<Map.Entry> itr1 = entries.iterator();
		System.out.println("Pritning keys and values using iterator");
		while (itr1.hasNext()) {
			Map.Entry entry = itr1.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		// Firstly sort lists
		Collections.sort(l1);
		Collections.sort(l2);

		// comparing
		System.out.println(l1.equals(l2));

		// checking which elements are not matching
		l2.removeAll(l1);
		System.out.println(l2);

		// finding common elements
		l5.retainAll(l4);
		System.out.println(l5);

	}

}

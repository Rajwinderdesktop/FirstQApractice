 package first;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("rajwinder");
		set.add("john");
		set.add("singh");
		set.add("john");
		set.add("singh");
		set.add("bc");
		set.add("john");
		set.add("singh");
		System.out.println(set);
		set.remove("john");
		System.out.println(set.size());

	}

}

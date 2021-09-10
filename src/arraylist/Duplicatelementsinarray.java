package arraylist;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicatelementsinarray {

	public static void main(String[] args) {
		String[] atrarr = {"Amazon","GCP","Azure","Ali Baba","SauceLabs","Azure","Amazon","GCP"};
		HashSet set = new HashSet();
		for(String s: atrarr) {
			if(set.contains(s)) {
				System.out.println(s);
			}else {
				set.add(s);
			}
			
		}

	}

}

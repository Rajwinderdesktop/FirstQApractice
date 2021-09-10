package javainterviewques;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Getdistict_character_and_count_inString {

	public static void main(String[] args) {
		String str="rjaiwndersinghismy name";
		
		
		
		System.out.println(Getdistinct(str));

	}
	
	
	
	
	
	
	//using HashMap
	public static  Map<Character,Integer> Getdistinct(String str){
		char[] ch = str.toCharArray();
		Map<Character,Integer> Store = new HashMap<>();
	
		for(char c:ch) {
			if(Store.containsKey(c)) {
				Store.put(c, Store.get(c)+1);
			}else
				Store.put(c, 1);
		}
		return Store;
	}

}

package javainterviewques;

import java.util.HashMap;

public class Countdistinctnumberofwordsinstring {

	public static void main(String[] args) {
		String str="rajwindersingh is my name";
		String[] s = str.split(" ");
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++) {
			if(map.containsKey(s[i])) {
				map.put(s[i],map.get(s[i])+1);
			}else {
				map.put(s[i],1);
			}
		}
System.out.println(map);
	}

}

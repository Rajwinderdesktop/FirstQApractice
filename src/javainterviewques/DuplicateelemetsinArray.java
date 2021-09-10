package javainterviewques;

import java.util.HashSet;
import java.util.Set;

//very important
public class DuplicateelemetsinArray {

	public static void main(String[] args) {
		String name[]= {"raj","singh","singh","der","fkjwlg"};
		
		//1.comapring each element
		for(int i =0; i<name.length;i++) {
			for(int j=i+1; j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
				
			}
		}//n complexity is O N^2
		
		//using hashset
	
		Set<String> store = new HashSet<String>();
		for(String e : name) {
		if (store.add(e)==false) {
			System.out.println(e);
			
		
		
		
		
		
		}	

	}
	}
}

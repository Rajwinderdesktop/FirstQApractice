package mapInterface;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {
	public static void main(String[] args) {
		
		//no order
		//store key-pair value
		//no duplicate 
		
		
		HashMap<String, String> CM = new HashMap<String,String>(); 
		
		
		
		//adding values
		CM.put("India", "Delhi");
		CM.put("Germany", "Berlin");
		CM.put("Canada", "Ottawa");
		CM.put(null,"great");
		//HashMap allows one null key but multiple null values
		
		
		
		//getting values
		System.out.println(CM.get("India"));
		System.out.println(CM.get(null));
		
		CM.put(null, null);
		System.out.println(CM.get(null));
		
		//iterating
//		Iterator<String> it =CM.keySet().iterator();
//		while(it.hasNext()) {
//			String keyString=it.next();
//			System.out.println(CM.get(keyString));
//			
			//removing
			//removing pair through key
			CM.remove("India");
			
			System.out.println(CM);
			
			//removing value through pair
			CM.remove("Canada","Ottawa");
			System.out.println(CM);
			
			
		
	}
}

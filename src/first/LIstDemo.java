package first;

import java.util.ArrayList;
import java.util.Iterator;

public class LIstDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list1 =new ArrayList<String>();//only Strings
		ArrayList list2 =new ArrayList(); //can contain any object
		list1.add("John");
		list1.add("Rajwinder");
		list1.add("singh");
		
		
		list2.add("jfwejfwo");
		list2.add(34224);
		list2.add(list1);
		
		System.out.println("list 1 is "+ list1);
		System.out.println("list 2 is "+ list2);
		
		String name =list1.get(2);
		Object o= list2.get(2);
		System.out.println(name + o);
		
		list1.set(2, "ram");
		list2.remove(2);
		
		System.out.println("list 1 is "+ list1);
		System.out.println("list 2 is "+ list2);
		
		//iterate
		for(String s: list1) {
			System.out.println(s);
		}
		
		
		
		
		
	}
}

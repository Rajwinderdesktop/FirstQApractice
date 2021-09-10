package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayLIst {

	public static void main(String[] args) {
		// different ways of creating arraylist
		
		//1. generic method
		ArrayList<Object> ar = new ArrayList<Object>();
		
		//2.specific datatype
		ArrayList<Integer> ryet = new ArrayList<Integer>();

		//3.How will you create arraylist from array
		ArrayList<Integer> ry = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println(ry);

		//4.Creating araylist from strings
		ArrayList<String> ryi = new ArrayList<String>(Arrays.asList("rja", "ind", "fjfs"));
		System.out.println(ryi);
		

		// virtualCapacity concept


		// all methods
		//
		//
		//

		// adding values to indexes
		ar.add(110);
		ar.add("rajwinder");
		ar.add('c');
		ar.add(false);
		ar.add(10.5);
		// arraylist will store the objects dynamically and its size will change
		// dynamically
		// objects are stored at follwing index.

		// getting size
		System.out.println(ar.size());

		// getting values
		System.out.println(ar.get(3));

		// ar.get(19);//will give IndexOutOfBoundsException

		//contain,containAll
		System.out.println(ar.contains(110));
		//return boolean
		//important for asserting
		
		//can be cloned,cleared
		
		//IQ removing even numbers for arraylist
		ArrayList<Integer> even = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,98,45,12,56));
		even.removeIf(num -> num%2!=0);
		System.out.println(even);
		
		//sublist
		ArrayList<Integer> syb = new ArrayList<Integer>(even.subList(2,4));
		System.out.println(syb);
		
		//important methods for compairing
		//removeAll
		//retainAll
		//.equals
		
	}

}

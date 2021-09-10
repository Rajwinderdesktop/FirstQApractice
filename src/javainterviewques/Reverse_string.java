package javainterviewques;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Reverse_string {

	public static void main(String[] args) {
			String str= "Rajwinder is my name";
			String raj ="";
			int len =str.length();
			for(int i=len-1;i>=0;i--) {
				raj =raj+ str.charAt(i);
			}
			
				
				
			
			System.out.println(raj);

	
//	
//	StringBuffer newstr= new StringBuffer(str);
//	System.out.println(newstr.reverse());
	
	}
}

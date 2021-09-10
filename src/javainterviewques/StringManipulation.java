package javainterviewques;

public class StringManipulation {

	public static void main(String[] args) {
		String str="rajwinder is my name";
		
		//size of string
		System.out.println(str.length());
		
		//checking character at nth index.
		System.out.println(str.charAt(2));
		
		//adding character
		//not allowed bcoz string is immutable.
		//string can be changed by concatting itself but that will be new string in the string pool
		String strnew = str+"newraj";
		System.out.println(strnew);
		
		//first occurance of any character.
		System.out.println(str.indexOf('a'));
		
		//second occurance of any chracter
		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		
		//multiple occurance
		//create method self calling n times
		
		//index of string
		System.out.println(str.indexOf("name"));
		
		//if it returns -1 then it means that string or chracter is not present
		
		//containing string or not
		System.out.println(str.contains("is"));
		
		//equals ignorecase will ignore case sensitivity
		
		//substring
		String newstr =str.substring(5);
		String newstr2 =str.substring(5, 10);
		System.out.println(newstr);
		System.out.println(newstr2);

		
		//converting string to character array for iteration of characters
		//because string is not able to iterate its characters.
		
		//trim() will remove the spaces from front and behind.
		
		//replacing chracters or removing space between the words.
		System.out.println(str.replace(" ",""));
		
		//splitting string by at all spaces
		String[] str2 = str.split(" ");
				//return array of string
		for(String s:str2) {
			System.out.println(s);
		}
		
		
		//concatting or joining strings
			
		String rs ="Canada";
		int i=100;
		int j=654;
		//concat
		System.out.println(str.concat(rs));
		// + operator 
		//important interview qs
		System.out.println(str+rs+i+j);
		//will return rajwinder is my nameCanada100654
		//not rajwinder is my nameCanada754 bcoz it runs left to right in line.
		
		System.out.println(str+rs+(i+j));
		// will retun rajwinder is my nameCanada754 bcoz of bracket
		// +opertor can concat with any any datatype even boolean
	}
	

}

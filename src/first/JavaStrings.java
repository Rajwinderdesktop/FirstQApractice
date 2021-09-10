package first;

public class JavaStrings {

	public static void main(String[] args) {
		String str="rajwinder,singh,is,my,name";
	
		int len =str.length();
		
		System.out.println("length os str is " + len);
		
		System.out.println("first char is "+ str.charAt(0)+" and last char is "+ str.charAt(len-1));
		
		String str2= str.toUpperCase();
		System.out.println(str2);
		
		String str3 =str.toLowerCase();
		System.out.println(str3);
		
		if(str.contains("singh")) {
			System.out.println("str contains singh");
		
		}
		
		String substr= str.substring(10, 15);//fetching singh
		System.out.println(substr);
		
		String str4 =str.replace('i', 'z');
		System.out.println(str4);
		
		String[] s1 =str.split(",");
		for(String s :s1) {
			System.out.println(s.trim());
		}
		
//		char[] Charr = str.toCharArray();
//		for(char ch :Charr) {
//			System.out.println(ch + " ");
//		}
		
		
	}
}
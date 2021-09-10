package javainterviewques;

public class Code_forNull_Pointer_exception {

	public static void main(String[] args) {
		
//		Code_forNull_Pointer_exception ex= new Code_forNull_Pointer_exception();
//		String name = null;
//		System.out.println(name.toLowerCase());
		
		String s1="rajwinder";
		String s2= new String("rajwinder");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
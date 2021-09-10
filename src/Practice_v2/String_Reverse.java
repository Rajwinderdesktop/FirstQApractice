package Practice_v2;

public class String_Reverse {

	public static void main(String[] args) {
		String str="Rajwidner singh is  my name";
		String str2 = new String();
		for(int i=0;i<str.length();i++) {
			str2=str2+str.charAt(str.length()-1-i);
		}
	System.out.println(str2);

	StringBuilder sr = new StringBuilder(str);
	System.out.println(sr.reverse());
	}
	

}

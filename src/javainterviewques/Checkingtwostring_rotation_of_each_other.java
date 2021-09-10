package javainterviewques;

public class Checkingtwostring_rotation_of_each_other {

	public static void main(String[] args) {
		Rotation("pots","stop");

	}


	public static void Rotation(String one, String two) {
		int len =one.length();
		
				for(int i=0;i<len;i++) {
					if(one.charAt(i)!=two.charAt(len-1-i)) {
						System.out.println("Strings are not rotated");
						break;
						
					}
		
	}
}
	}

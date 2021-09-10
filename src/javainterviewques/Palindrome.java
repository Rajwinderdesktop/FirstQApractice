package javainterviewques;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(Palindrome(124321));

	}
	public static boolean Palindrome(int num) {
		int sum=0;
		int t=num;
		 while(num>0) {
			 sum= sum *10+ num%10;
			 num=num/10;
		 }
			 if (sum==t)
				 return true;
			 else 
				 return false;
	}

}

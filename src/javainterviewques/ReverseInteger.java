package javainterviewques;

public class ReverseInteger {

	public static void main(String[] args) {
		int raj =625810;
		int rev =0;
		//by for loop
		while(raj!=0) {
			rev= rev*10+ raj%10;
			raj=raj/10;
		}
		System.out.println(rev);
	//using string buffer
		long raje =346376027;
		StringBuffer newint = new StringBuffer(String.valueOf((raje)));
		System.out.println(newint);
		

	}

}

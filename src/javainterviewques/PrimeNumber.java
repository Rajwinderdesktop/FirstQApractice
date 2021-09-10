package javainterviewques;

public class PrimeNumber {

	public static void main(String[] args) {
 int num =32;
   
 for (int i =2;i<num;i++) {
	 if(i==num-1) {
		 System.out.println("prime number");
	 }else if(num%i==0) {
		 System.out.println("not prime");
		 break;
	 }
	
 }

	}

}

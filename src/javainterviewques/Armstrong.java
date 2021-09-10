package javainterviewques;

public class Armstrong {

	public static void main(String[] args) {
	System.out.println(Armstrong(371));

	}
	public static boolean Armstrong(int num) {
		int cube =0;
		int real =num;
		while(num>0) {
			int r = num%10;
			num=num/10;
			cube=cube + r*r*r;
	
		}
		if(cube==real) {
			return true;
			
		}else
			return false;
	}

}

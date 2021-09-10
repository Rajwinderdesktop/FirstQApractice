package Practice_v2;

public class Primenumber {

	public static void main(String[] args) {
		int num=22;
		for(int i=num-1;i>=2;i--) {
			if(num%i==0) {
				System.out.println("Not prime");
				break;
			}else if(num%2==0) {
				System.out.println("not prime");
				break;
				
			}else if(i==2) {
				System.out.println("prime");
			}
		}

	}

}

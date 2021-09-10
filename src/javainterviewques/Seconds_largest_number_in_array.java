package javainterviewques;

public class Seconds_largest_number_in_array {

	public static void main(String[] args) {
		int numbers[] = { 12,13,-1};

		
		int high = numbers[0];
		int secondhigh=numbers[0];
		for (int i:numbers) {
			if(i>high) {
				secondhigh=high;
				high=i;
			}else if(i>secondhigh) {
				secondhigh=i;
				
			}

		}
		System.out.println(secondhigh);
		System.out.println(high);

	}

}

package javainterviewques;

public class LargestSmallestnumberarray {

	public static void main(String[] args) {
		int numbers[] = { 12,-1,13};

		int smallest = numbers[0];
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}else {
				largest=numbers[i];
			}

		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}

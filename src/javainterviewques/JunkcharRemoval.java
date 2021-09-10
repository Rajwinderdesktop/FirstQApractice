package javainterviewques;

public class JunkcharRemoval {

	public static void main(String[] args) {
		String raj ="&%$)*@#rajwinder13435308";
		raj.replaceAll("[^a-zA-Z]","");
	
		System.out.println(raj);

	}

}

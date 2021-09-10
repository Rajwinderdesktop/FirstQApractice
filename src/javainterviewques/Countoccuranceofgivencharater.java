package javainterviewques;

public class Countoccuranceofgivencharater {

	public static void main(String[] args) {
		String str="Rajwrrrrinder";
		str=str.toLowerCase();
		int sum=0;
		char c ='r';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				sum+=1;
			}
			
		}
		System.out.println(sum);
	}

}

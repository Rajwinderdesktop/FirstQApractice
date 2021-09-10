package first;

public class method_overloading {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		String name ="Rajwinder";
		
		overload(a);//overloading with one arguement
		overload(a,b); //overloading with two arguement
		overload(name); //overloading with String  arguement

	}
	
	public static void overload(int a) {
		System.out.println(a*20);
	}
	
	public static void overload(int a, int b) {
		System.out.println(a*b*20);
	}

	public static void overload (String name) {
		System.out.println(name);
	}
}

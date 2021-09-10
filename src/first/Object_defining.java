package first;

public class Object_defining {

	public static void main(String[] args) {
		int a;
		a = 10;
		int b = 20;

		
		Object_defining d = new Object_defining();
		d.name();
		

	}

	public static void name() { // method without return type
		System.out.println("My name is Rajwinder");

	}

	protected  Object_defining() {
		System.out.println("constructor");
	}
}

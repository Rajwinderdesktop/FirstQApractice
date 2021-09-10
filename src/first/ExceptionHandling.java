package first;

public class ExceptionHandling {

	public static void main(String[] args) throws ArithmeticException{
	
		try {
		throw new Exception("Rajwinder exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("code after exception");
	}
}


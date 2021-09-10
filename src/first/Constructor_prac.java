package first;

public  class Constructor_prac {

	
	 String name;
	 int age;
	public static void main(String[] args) {
		
		
		Constructor_prac ram = new Constructor_prac("Ram", 20);
		
		System.out.println("Age of "+ ram.name +" is "+ ram.age);
	
	}
	
	
	public Constructor_prac(String name, int age) {//using this keyword
		this.name=name;
		this.age =age;
}
	}

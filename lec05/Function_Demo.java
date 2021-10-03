package lec05;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("A=10, B=2");
		addition(); // Function Calling
		System.out.println(sub()); // int c= sub(); //System.out.println(c);
		multiply(10, 2);
		divide(10,2);
		System.out.println("Bye");
	}

	public static void addition() {// No return type + No parameter
		int a = 10;
		int b = 2;
		int c = a + b;
		System.out.println("Addition: " + c);
	}

	public static int sub() {// return type + No parameter
		int a = 10;
		int b = 2;
		int c = a - b;
		System.out.print("Subtraction: ");
		return c;
	}

	public static void multiply(int a, int b) {// No return type + parameter
		int c = a * b;
		System.out.println("Multiply: " + c);
	}
	
	public static int divide(int a, int b) {// No return type + No parameter
		int c = a/b;
		System.out.println("Divide: " + c);
		return c;
	}
}

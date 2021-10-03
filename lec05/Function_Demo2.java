package lec05;

public class Function_Demo2 {

	static int val=100; //global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=7;
		System.out.println(a+" "+b);
		swap(a,b);
		System.out.println(a+" "+b);
		System.out.println(val);
	}

	public static void swap(int a, int b) {
		int val=500;
		System.out.println(val);
		System.out.println(Function_Demo2.val); // if you want to access global variable with local variable then use (classname.variablename)
		int t=a;
		a=b;
		b=t;
		System.out.println(a+" "+b);

	}
}

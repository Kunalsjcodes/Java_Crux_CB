package Self_Practice;

import java.util.*;

public class Equal_Different_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number:- ");
		int a = sc.nextInt();
		System.out.print("Input second number:- ");
		int b = sc.nextInt();
		System.out.print("Input third number:- ");
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println("All numbers are equal");
		} else if (a == b || b == c || a == c) {
			System.out.println("Neither all are equal or different");
		} else {
			System.out.println("All numbers are different");
		}
	}

}

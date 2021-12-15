package Self_Practice;

import java.util.*;

public class Greatest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the 1st number:");
		int a = sc.nextInt();
		System.out.print("Input the 2nd number:");
		int b = sc.nextInt();
		System.out.print("Input the 3rd number:");
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("The greatest: " + a);
			}
		}

		if (b > a) {
			if (b > c) {
				System.out.println("The greatest: " + b);
			}
		}

		if (c > a) {
			if (c > b) {
				System.out.println("The greatest: " + c);
			}
		}

	}

}

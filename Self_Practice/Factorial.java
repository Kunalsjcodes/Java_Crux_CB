package Self_Practice;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number:- ");
		int n = sc.nextInt();

		int i, factorial = 1;
		for (i = 1; i <= n; i++) {
			factorial= factorial*i;
		}
		System.out.println("The Factorial of " + 5 + " is:- " + factorial);
	}

}

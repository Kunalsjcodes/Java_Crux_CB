package Self_Practice;

import java.util.*;

public class Airthmetic_Progression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of first n terms = n/2[2a + (n − 1) × d]

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the starting number of the A.P. series:- ");
		int a = sc.nextInt();
		System.out.print("Input the number of items for the A.P. series:- ");
		int n = sc.nextInt();
		System.out.print("Input the common difference of A.P. series:- ");
		int d = sc.nextInt();

		int sum = (n * (2 * a + (n - 1) * d)) / 2;

		System.out.println("The Sum of the A.P. series are:- ");

		for (int i = 1; i <= n; i++) {
			int tn = a + (i - 1) * d; // To calculate terms.

			if (i == n) {
				System.out.print(tn);
			} else {
				System.out.print(tn + " + ");
			}

		}

		System.out.print(" = " + sum);
	}

}

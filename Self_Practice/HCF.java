package Self_Practice;

import java.util.*;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Input 1st number for HCF:- ");
		int a = sc.nextInt();
		System.out.print("Input 2nd number for HCF:- ");
		int b = sc.nextInt();
		int c = b;
		while (a % b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		System.out.println("HCF of " + a + " and " + c + " is:- "+ b);
	}
}

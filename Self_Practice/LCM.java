package Self_Practice;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 1st number for LCM:- ");
		int a = sc.nextInt();
		System.out.print("Input 2nd number for LCM:- ");
		int b = sc.nextInt();
		int c = b;

		// HCF
		while (a % b != 0) {
			int rem = a % b;
			a = b;
			b = rem;
		}
		// LCM
		int lcm = (a * c) / b;
		System.out.println("LCM of " + a + " and " + c + " is:- " + lcm);

	}

}

package Self_Practice;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number:- ");
		int n = sc.nextInt();

		int i, rem, sum = 0;

		for (i = n; n != 0; n /= 10) {
			rem = n % 10;
			sum = (sum * 10) + rem;
		}

		if (i == sum) {
			System.out.println(i + " is a palindrome number.");
		} else {
			System.out.println(i + " is not a palindrome number.");
		}
	}

}

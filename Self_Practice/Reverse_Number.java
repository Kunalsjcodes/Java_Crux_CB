package Self_Practice;

import java.util.*;

public class Reverse_Number {

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
		System.out.print("The number in reverse order is:- " + sum);
	}

}

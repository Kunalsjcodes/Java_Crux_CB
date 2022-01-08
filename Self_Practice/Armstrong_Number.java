package Self_Practice;

import java.util.*;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number:- ");
		int n = sc.nextInt();

		int i, r, sum = 0;

		for (i = n; n != 0; n = n / 10) {
			r = n % 10;
			sum = sum + (r * r * r);
		}

		if (sum == i) {
			System.out.print(i + " is an Armstrong Number");
		} else {
			System.out.println(i + " is not an Armstrong Number");
		}
	}

}

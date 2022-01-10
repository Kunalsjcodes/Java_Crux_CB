package Self_Practice;

import java.util.Scanner;

public class Armstrong_n_digit_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number:- ");
		int n = sc.nextInt();

		int i, r, sum = 0, count = 0, temp = n;

		while (n > 0) {
			n /= 10;
			count++;
		}

		for (i = n; n != 0; n = n / 10) {
			r = n % 10;
			sum += (Math.pow(r, count));
		}

		if (sum == i) {
			System.out.print(temp + " is an Armstrong Number");
		} else {
			System.out.println(temp + " is not an Armstrong Number");
		}
	}
}

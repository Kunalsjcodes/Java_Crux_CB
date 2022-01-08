package Self_Practice;

import java.util.*;

public class N_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input starting number of range:- ");
		int start = sc.nextInt();
		System.out.print("Input ending number of range:- ");
		int end = sc.nextInt();

		int num, r, sum, temp;
		System.out.print("Armstrong numbers in given range are:- ");
		for (num = start; num <= end; num++) {
			temp = num;
			sum = 0;

			while (temp != 0) {
				r = temp % 10;
				temp = temp / 10;
				sum = sum + (r * r * r);
			}
			if (sum == num) {
				System.out.print(num + " ");
			}
		}
	}
}
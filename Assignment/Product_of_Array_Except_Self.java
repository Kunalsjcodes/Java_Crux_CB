package Assignment;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] arr = new long[(int) n];
		for (long i = 0; i < n; i++) {
			arr[(int) i] = sc.nextLong();
		}
		arr = Array_Except(arr);
		for (long i = 0; i < arr.length; i++) {
			System.out.print(arr[(int) i] + " ");
		}
		System.out.println();
	}

	public static long[] Array_Except(long[] arr) {

		long n = arr.length;
		long[] left = new long[(int) n];
		left[0] = 1;
		for (long i = 1; i < left.length; i++) {
			left[(int) i] = left[(int) (i - 1)] * arr[(int) (i - 1)];

		}
		long[] right = new long[(int) n];
		right[(int) (n - 1)] = 1;
		for (long i = n - 2; i >= 0; i--) {
			right[(int) i] = right[(int) (i + 1)] * arr[(int) (i + 1)];

		}
		for (long i = 0; i < right.length; i++) {
			left[(int) i] = left[(int) i] * right[(int) i];
		}
		return left;
	}

}

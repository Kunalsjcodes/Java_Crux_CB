package lec06;

import java.util.Scanner;

public class Optimized_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - k - 1);
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - 1);

	}

	public static void reverse(int[] arr, int i, int j) {

		while (i < j) {
			// Swaping
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

			i++;
			j--;

		}

	}

}

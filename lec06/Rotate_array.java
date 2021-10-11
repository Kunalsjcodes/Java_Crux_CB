package lec06;

import java.util.Scanner;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		rotatearray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void rotatearray(int[] arr, int k) {
		k = k % arr.length;
		for (int r = 1; r <= k; r++) {

			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];

			}
			arr[0] = last;
		}
	}
}

package lec06;

import java.util.Scanner;

public class Max_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE; // -2^31
		int idx=-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				idx=i;
			}
		}
		return idx;

	}

}

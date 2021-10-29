package Assignment;

import java.util.Scanner;

public class Maximum_Subarray_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(kadane(arr));
	}

	public static int kadane(int[] arr) {
		int maxSoFar = 0;

		int maxEndingHere = 0;
		for (int i : arr) {
			maxEndingHere = maxEndingHere + i;
			maxEndingHere = Integer.max(maxEndingHere, 0);
			maxSoFar = Integer.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}
}

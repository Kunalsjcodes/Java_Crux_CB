package Assignment;

import java.util.Scanner;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc != 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(trap(arr));
		}
		tc--;

	}

	public static int trap(int[] arr) {
		int n = arr.length;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		left[0] = arr[0];
		right[n - 1] = arr[n - 1];
		for (int i = 1; i < right.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);

		}
		for (int i = n - 2; i >= 0; i--) {

			right[i] = Math.max(right[i + 1], arr[i]);
		}
		int total_water = 0;
		for (int i = 0; i < right.length; i++) {

			total_water += (Math.min(left[i], right[i]) - arr[i]);
		}
		return total_water;
	}
}

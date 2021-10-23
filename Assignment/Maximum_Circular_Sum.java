package Assignment;

import java.util.Scanner;

public class Maximum_Circular_Sum {

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
			int sum = 0;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				sum = cal_sum(arr, i);
				if (sum > max) {
					max = sum;
				}
			}
			System.out.println(max);
			tc--;
		}

	}

	public static int cal_sum(int[] arr, int ind) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = ind; i < arr.length + ind; i++) {
			sum += arr[i % arr.length];
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

}

package Assignment;

import java.util.*;

public class Array_Target_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		pairs(arr, target);
	}

	public static void pairs(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {

						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);

					}
				}
			}

		}

	}
}
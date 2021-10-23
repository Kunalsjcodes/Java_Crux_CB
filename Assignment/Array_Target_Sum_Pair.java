package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Target_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int ts = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == ts) {
					System.out.println(arr[i] + " and " + arr[j]);
				}
			}
		}
	}
}

package Assignment;

import java.util.Scanner;

public class RunningSumOfGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			arr2[i] = sum;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}

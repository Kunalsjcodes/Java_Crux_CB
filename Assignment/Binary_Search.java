package Assignment;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(search(arr, m));
	}

	public static int search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}

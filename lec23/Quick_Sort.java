package lec23;

import java.util.*;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the length of array:- ");
		int n = sc.nextInt();
		System.out.print("Input array of " + n + " size:- ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		QuickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void QuickSort(int arr[], int si, int ei) {
		if (si > ei) {
			return;
		}

		int pi = pivot_index(arr, si, ei);
		QuickSort(arr, si, pi - 1);
		QuickSort(arr, pi + 1, ei);
	}

	public static int pivot_index(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int pi = si; // index of pivot
		for (int i = si; i <= ei - 1; i++) {
			if (arr[i] <= pivot) {
				int t = arr[pi];
				arr[pi] = arr[i];
				arr[i] = t;
				pi++;
			}
		}
		int t = arr[pi];
		arr[pi] = arr[ei];
		arr[ei] = t;

		return pi;
	}
}

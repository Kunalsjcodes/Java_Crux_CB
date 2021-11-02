package Leetcode;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/next-permutation/
	}

	public void nextPermutation(int[] arr) {
		int p = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}

		}
		if (p == -1) {
			Reverse(arr, 0, arr.length - 1);
			return;
		}
		int q = -1;
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		// swap
		int t = arr[p];
		arr[p] = arr[q];
		arr[q] = t;
		Reverse(arr, p + 1, arr.length - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {

			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}

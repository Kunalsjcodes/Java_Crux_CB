package Leetcode;

public class Kth_Missing_Positive_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/kth-missing-positive-number/
	}

	public int findKthPositive(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		int ans = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] - (mid + 1) < k) {
				ans = mid + 1;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return k + ans;
	}
}

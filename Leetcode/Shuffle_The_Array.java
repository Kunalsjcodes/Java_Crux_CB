package Leetcode;

public class Shuffle_The_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/shuffle-the-array/
	}

	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[n * 2];

		for (int i = 0; i < n; i++) {
			ans[i * 2] = nums[i];
			ans[2 * i + 1] = nums[n + i];
		}

		return ans;
	}
}

package Leetcode;

public class Check_if_Array_Is_Sorted_and_Rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
	}

	public boolean check(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (nums[i - 1] > nums[i])
				count++;
		}
		if (nums[0] < nums[n - 1]) {
			count++;
		}
		return count <= 1;
	}
}

package Leetcode;

public class Running_Sum_of_1d_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/running-sum-of-1d-array/
	}

	public int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		return nums;
	}
}

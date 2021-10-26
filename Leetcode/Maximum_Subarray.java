package Leetcode;

public class Maximum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-subarray/
	}

	public int maxSubArray(int[] nums) {
		int currSum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			currSum = Math.max(currSum + nums[i], nums[i]);
			max = Math.max(currSum, max);
		}
		return max;
	}
}
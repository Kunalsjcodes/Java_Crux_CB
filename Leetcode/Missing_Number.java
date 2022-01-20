package Leetcode;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/missing-number/
	}

	public int missingNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans += nums[i] - i;
		}
		ans = nums.length - ans;
		return ans;
	}
}

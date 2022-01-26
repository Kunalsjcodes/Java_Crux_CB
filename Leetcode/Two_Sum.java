package Leetcode;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/two-sum/submissions/
	}

	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				}
				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
	}
}

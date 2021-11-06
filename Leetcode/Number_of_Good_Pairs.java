package Leetcode;

public class Number_of_Good_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/number-of-good-pairs/
	}

	public int numIdenticalPairs(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					ans++;
			}
		}
		return ans;
	}
}
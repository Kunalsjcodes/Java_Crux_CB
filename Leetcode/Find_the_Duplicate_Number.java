package Leetcode;

import java.util.*;

public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-the-duplicate-number/
	}

	public int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		int res = -1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				res = nums[i];
				break;
			}
		}
		return res;
	}
}

package Leetcode;

import java.util.*;

public class Single_Number_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/single-number-ii/submissions/
	}

	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length - 2) {
			if (((nums[i] ^ nums[i + 1]) != 0) || ((nums[i] ^ nums[i + 2]) != 0))
				return nums[i];
			i += 3;
		}
		return nums[i];

	}
}

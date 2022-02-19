package Leetcode;

import java.util.*;

public class Count_Elements_With_Strictly_Smaller_and_Greater_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
	}

	public int countElements(int[] nums) {
		if (nums.length < 3) {
			return 0;
		}

		Arrays.sort(nums);
		int result = 0;
		int min = nums[0];
		int max = nums[nums.length - 1];

		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] > min && nums[i] < max) {
				result++;
			}
		}

		return result;
	}

}

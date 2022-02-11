package Leetcode;

import java.util.*;

public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
	}

	public int minimumSum(int num) {
		int nums[] = new int[4];

		int i = 0;
		while (num > 0) {
			nums[i++] = num % 10;
			num = num / 10;
		}
		Arrays.sort(nums);

		int n = nums[0] * 10 + nums[2];
		int m = nums[1] * 10 + nums[3];

		return n + m;
	}
}

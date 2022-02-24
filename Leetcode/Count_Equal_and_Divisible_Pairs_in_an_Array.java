package Leetcode;

public class Count_Equal_and_Divisible_Pairs_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
	}

	public int countPairs(int[] nums, int k) {
		int len = nums.length;
		int count = 0;

		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				// if (nums[i] == nums[j] && (i * j) % k == 0)
				if (nums[i] == nums[j]) {
					if ((i * j) % k == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}
}

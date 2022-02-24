package Leetcode;

public class Largest_Number_At_Least_Twice_of_Others {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/largest-number-at-least-twice-of-others/
	}

	public int dominantIndex(int[] nums) {
		int n = nums.length;
		int max = nums[0];
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (max < nums[i]) {
				max = nums[i];
				index = i;
			}
		}
		for (int i = 0; i < n; i++) {
			if (index != i && max < 2 * nums[i]) {
				return -1;
			}
		}
		return index;
	}

}

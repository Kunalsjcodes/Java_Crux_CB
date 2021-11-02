package Leetcode;

public class Move_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/move-zeroes/
	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				if (i != j) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
				j++;
			}
		}
	}
}

package Leetcode;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
	}

	public int specialArray(int[] nums) {
		int count = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] >= i) {
					count++;
				}
			}
			if (count == i) {
				return i;
			} else {
				count = 0;
			}
		}
		return -1;
	}

}

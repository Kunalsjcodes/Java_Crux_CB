package Leetcode;

public class Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/remove-element/
	}

	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}

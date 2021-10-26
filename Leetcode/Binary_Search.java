package Leetcode;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/binary-search/
	}

	public int search(int[] nums, int target) {
		int pivot, left = 0, right = nums.length - 1;
		while (left <= right) {
			pivot = left + (right - left) / 2;
			if (nums[pivot] == target)
				return pivot;
			if (target < nums[pivot])
				right = pivot - 1;
			else
				left = pivot + 1;
		}
		return -1;
	}
}
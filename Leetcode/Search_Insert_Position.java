package Leetcode;

public class Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/search-insert-position/
	}

	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}
}

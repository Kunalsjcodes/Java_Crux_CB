package Leetcode;

public class Find_Peak_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-peak-element/
	}

	public int findPeakElement(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;
			if (nums[mi] < nums[mi + 1]) {
				lo = mi + 1;
			} else {
				hi = mi;
			}
		}
		return lo;
	}

}

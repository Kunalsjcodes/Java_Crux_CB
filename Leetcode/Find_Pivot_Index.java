package Leetcode;

public class Find_Pivot_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-pivot-index/
	}

	public int pivotIndex(int[] nums) {
		int sum = 0, leftsum = 0;
		for (int x : nums) {
			sum += x;
		}
		for (int i = 0; i < nums.length; ++i) {
			if (leftsum == sum - leftsum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}
		return -1;
	}
}

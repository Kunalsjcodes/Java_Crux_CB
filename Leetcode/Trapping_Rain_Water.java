package Leetcode;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/trapping-rain-water/
	}

	public int trap(int[] height) {
		int n = height.length;
		int[] left = new int[height.length];
		int[] right = new int[height.length];
		left[0] = height[0];
		right[n - 1] = height[n - 1];
		for (int i = 1; i < right.length; i++) {
			left[i] = Math.max(left[i - 1], height[i]);

		}
		for (int i = n - 2; i >= 0; i--) {

			right[i] = Math.max(right[i + 1], height[i]);
		}
		int total_water = 0;
		for (int i = 0; i < right.length; i++) {

			total_water += (Math.min(left[i], right[i]) - height[i]);
		}
		return total_water;

	}
}

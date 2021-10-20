package Leetcode;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/product-of-array-except-self/
	}

	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];

		}
		int r = 1;
		for (int i = n - 1; i >= 0; i--) {
			left[i] = left[i] * r;
			r = r * nums[i];

		}

		return left;
	}
}

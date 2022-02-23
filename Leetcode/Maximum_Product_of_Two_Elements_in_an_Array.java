package Leetcode;

public class Maximum_Product_of_Two_Elements_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	}

	public int maxProduct(int[] nums) {
		int tempCal = 0;
		int maxProduct = (nums[0] - 1) * (nums[1] - 1);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				tempCal = (nums[i] - 1) * (nums[j] - 1);
				if (maxProduct < tempCal)
					maxProduct = tempCal;
			}
		}
		return maxProduct;
	}
}

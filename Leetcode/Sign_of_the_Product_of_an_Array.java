package Leetcode;

public class Sign_of_the_Product_of_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/sign-of-the-product-of-an-array/
	}

	public int arraySign(int[] nums) {
		int num = 1;

		for (int n : nums) {
			if (n == 0) {
				num = 0;
			} else if (n < 0) {
				num = -num;
			}
		}
		return num;

	}

}

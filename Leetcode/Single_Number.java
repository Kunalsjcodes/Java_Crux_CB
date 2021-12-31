package Leetcode;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/single-number/
	}

	public int singleNumber(int[] nums) {
		int x = 0;

		for (int a : nums) {
			x = x ^ a;
		}

		return x;
	}
}

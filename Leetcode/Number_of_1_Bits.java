package Leetcode;

public class Number_of_1_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/number-of-1-bits/
	}

	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < 32; i++) {
			count += (n >>> i) & 1;
		}
		return count;
	}
}

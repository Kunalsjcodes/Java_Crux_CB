package Leetcode;

public class Power_of_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/power-of-four/
	}

	public boolean isPowerOfFour(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 4 == 0) {
			n /= 4;
		}

		return n == 1;
	}
}

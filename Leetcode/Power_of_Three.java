package Leetcode;

public class Power_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/power-of-three/submissions/
	}

	public boolean isPowerOfThree(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;
	}
}

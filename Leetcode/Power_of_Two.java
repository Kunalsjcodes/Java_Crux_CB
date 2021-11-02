package Leetcode;

public class Power_of_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/power-of-two/
	}

	public boolean isPowerOfTwo(int n) {
		if (n <= 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		if (n % 2 != 0) {
			return false;
		}
		return isPowerOfTwo(n / 2);
	}
}

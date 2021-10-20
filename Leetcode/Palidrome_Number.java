package Leetcode;

public class Palidrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/palindrome-number/
	}

	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int reverse = 0;
		while (x > reverse) {
			reverse = reverse * 10 + x % 10;
			x /= 10;
		}
		return x == reverse || x == reverse / 10;
	}
}

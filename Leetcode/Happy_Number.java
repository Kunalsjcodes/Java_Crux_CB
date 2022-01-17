package Leetcode;

public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/happy-number/
	}

	public boolean isHappy(int n) {
		while (n > 9) {
			int num = n;
			int sum = 0;
			while (num > 0) {
				int r = num % 10;
				sum = sum + (r * r);
				num = num / 10;
			}
			n = sum;
		}
		if (n == 1 || n == 7) {
			return true;
		} else {
			return false;
		}
	}
}

package Leetcode;

public class Valid_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/valid-perfect-square/
	}

	public boolean isPerfectSquare(int num) {
		for (int i = 0; i * i >= 0 && i * i <= num; i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}
}

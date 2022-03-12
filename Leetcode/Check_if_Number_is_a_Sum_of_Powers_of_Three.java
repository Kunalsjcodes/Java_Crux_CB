package Leetcode;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
	}

	public boolean checkPowersOfThree(int n) {
		while (n != 0) {
			int rem = n % 3;

			if (rem != 0 && rem != 1)
				return false;
			n /= 3;
		}
		return true;
	}
}

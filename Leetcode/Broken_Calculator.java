package Leetcode;

public class Broken_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/broken-calculator/
	}

	public int brokenCalc(int startValue, int target) {
		int ans = 0;
		while (target > startValue) {
			ans++;
			if (target % 2 == 1)
				target++;
			else
				target /= 2;
		}

		return ans + startValue - target;
	}
}

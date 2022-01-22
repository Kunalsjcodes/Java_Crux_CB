package Leetcode;

public class Count_Odd_Numbers_in_an_Interval_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
	}

	public int countOdds(int low, int high) {

		int ans = 0;

		if (low % 2 == 0 && high % 2 == 0) {
			ans = (high - low) / 2;
		}

		else {
			ans = (high - low) / 2 + 1;
		}
		return ans;
	}
}

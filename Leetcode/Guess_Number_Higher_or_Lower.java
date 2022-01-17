package Leetcode;

public class Guess_Number_Higher_or_Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/guess-number-higher-or-lower/
	}

	public int guessNumber(int n) {
		int lo = 1;
		int hi = n;
		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;
			int result = guess(mi);
			if (result == 0) {
				return mi;
			}
			if (result == -1) {
				hi = mi - 1;
			} else {
				lo = mi + 1;
			}
		}
		return lo;
	}

	private int guess(int num) {
		// TODO Auto-generated method stub
		// -1: The number I picked is lower than your guess (i.e. pick < num).
		// 1: The number I picked is higher than your guess (i.e. pick > num).
		// 0: The number I picked is equal to your guess (i.e. pick == num).
		return 0;
	}
}

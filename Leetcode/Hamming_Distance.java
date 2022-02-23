package Leetcode;

public class Hamming_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/hamming-distance/
	}

	public int hammingDistance(int x, int y) {
		int n = x ^ y;
		int ans = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				ans += 1;
			}
			n >>= 1;
		}
		return ans;
	}
}

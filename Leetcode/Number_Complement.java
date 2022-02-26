package Leetcode;

public class Number_Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/number-complement/
	}

	public int findComplement(int num) {
		int ans = 1;
		while (ans - 1 < num) {
			ans <<= 1;
		}
		return ans - 1 - num;
	}
}

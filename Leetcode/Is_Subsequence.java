package Leetcode;

public class Is_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/is-subsequence/
	}

	public boolean isSubsequence(String s, String t) {
		if (s == null || s.length() == 0) {
			return true;
		}
		int j = 0;
		for (char c : t.toCharArray()) {
			if (c == s.charAt(j)) {
				j++;
			}
			if (j == s.length()) {
				return true;
			}
		}
		return false;
	}
}

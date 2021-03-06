package Leetcode;

public class Valid_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/valid-palindrome/
	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		boolean result = true;
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
				i++;
				continue;
			}
			if (!((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
				j--;
				continue;
			}
			if (s.charAt(i) != s.charAt(j)) {
				result = false;
				break;
			}
			i++;
			j--;
		}
		return result;
	}
}
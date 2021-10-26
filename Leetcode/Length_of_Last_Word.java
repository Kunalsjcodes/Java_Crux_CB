package Leetcode;

public class Length_of_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/length-of-last-word/
	}

	public int lengthOfLastWord(String s) {
		int len = 0;
		s = s.trim();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			} else {
				len++;
			}
		}
		return len;
	}
}

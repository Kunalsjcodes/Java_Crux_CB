package Leetcode;

public class Find_The_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-the-difference/
	}

	public char findTheDifference(String s, String t) {
		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			char letter = t.charAt(i);
			arr[letter - 'a']--;
			if (arr[letter - 'a'] < 0) {
				return letter;
			}
		}

		return 'j';
	}
}

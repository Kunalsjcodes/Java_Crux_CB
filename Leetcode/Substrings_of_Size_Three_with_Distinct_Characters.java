package Leetcode;

public class Substrings_of_Size_Three_with_Distinct_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	}

	public int countGoodSubstrings(String s) {
		int count = 0;
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1)
					&& s.charAt(i - 1) != s.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}
}

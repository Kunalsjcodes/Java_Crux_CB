package Leetcode;

public class Determine_if_String_Halves_Are_Alike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/determine-if-string-halves-are-alike/
	}

	public boolean halvesAreAlike(String s) {
		int count = 0, len = s.length();
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < len; i++) {
			if (i < len / 2) {
				if (vowels.contains(s.charAt(i) + "")) {
					count++;
				}
			} else {
				if (vowels.contains(s.charAt(i) + "")) {
					count--;
				}
			}
		}
		return count == 0;
	}
}

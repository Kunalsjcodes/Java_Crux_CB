package Leetcode;

public class Counting_Words_With_a_Given_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/counting-words-with-a-given-prefix/
	}

	public int prefixCount(String[] words, String pref) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].startsWith(pref)) {
				count++;
			}
		}
		return count;
	}
}

package Leetcode;

public class Reverse_Words_in_a_String_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/reverse-words-in-a-string-iii/
	}

	public String reverseWords(String s) {
		String words[] = s.split(" ");
		StringBuilder res = new StringBuilder();
		for (String word : words)
			res.append(new StringBuffer(word).reverse().toString() + " ");
		return res.toString().trim();
	}
}

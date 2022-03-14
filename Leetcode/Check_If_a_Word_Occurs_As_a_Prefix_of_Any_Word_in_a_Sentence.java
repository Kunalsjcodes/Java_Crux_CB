package Leetcode;

public class Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
	}

	public int isPrefixOfWord(String sentence, String searchWord) {
		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith(searchWord)) {
				return i + 1;
			}
		}
		return -1;
	}
}

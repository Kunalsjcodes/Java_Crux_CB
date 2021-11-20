package Leetcode;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/reverse-string/
	}

	public void reverseString(char[] s) {
		int left = 0;
		int end = s.length - 1;
		while (left < end) {
			// swap
			char temp = s[left];
			s[left] = s[end];
			s[end] = temp;

			left++;
			end--;
		}
	}
}
package Leetcode;

public class Reverse_Vowels_of_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/reverse-vowels-of-a-string/
	}

	public String reverseVowels(String s) {
		char[] array = s.toCharArray();

		boolean isStartPresent = false;
		boolean isEndPresent = false;

		int start = 0, end = array.length - 1;
		char temp;
		while (start < end) {

			if (checkVowel(array[start])) {
				isStartPresent = true;
			} else {
				start++;
			}

			if (checkVowel(array[end])) {
				isEndPresent = true;
			} else {
				end--;
			}

			if (isEndPresent && isStartPresent) {
				temp = array[end];
				array[end] = array[start];
				array[start] = temp;
				isStartPresent = false;
				isEndPresent = false;
				start++;
				end--;
			}
		}
		return String.valueOf(array);
	}

	public boolean checkVowel(char value) {
		if (value != 'a' && value != 'e' && value != 'i' && value != 'o' && value != 'u' && value != 'A' && value != 'E'
				&& value != 'I' && value != 'O' && value != 'U') {
			return false;
		}
		return true;
	}
}

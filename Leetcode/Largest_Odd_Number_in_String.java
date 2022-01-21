package Leetcode;

public class Largest_Odd_Number_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/largest-odd-number-in-string/
	}

	public String largestOddNumber(String num) {
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) % 2 == 1) {
				return num.substring(0, i + 1);
			}
		}
		return "";
	}
}

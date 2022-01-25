package Leetcode;

public class Integer_to_Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/integer-to-roman/
	}

	public String intToRoman(int number) {
		String c = "";
		while (number != 0) {
			if (number >= 1000) {
				c += "M";
				number -= 1000;
			} else if (number >= 900) {
				c += "CM";
				number -= 900;
			} else if (number >= 500) {
				c += "D";
				number -= 500;
			} else if (number >= 400) {
				c += "CD";
				number -= 400;
			} else if (number >= 100) {
				c += "C";
				number -= 100;
			} else if (number >= 90) {
				c += "XC";
				number -= 90;
			} else if (number >= 50) {
				c += "L";
				number -= 50;
			} else if (number >= 40) {
				c += "XL";
				number -= 40;
			} else if (number >= 10) {
				c += "X";
				number -= 10;
			} else if (number >= 9) {
				c += "IX";
				number -= 9;
			} else if (number >= 5) {
				c += "V";
				number -= 5;
			} else if (number >= 4) {
				c += "IV";
				number -= 4;
			} else if (number >= 1) {
				c += "I";
				number -= 1;
			}
		}
		return c;
	}
}

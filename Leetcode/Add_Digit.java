package Leetcode;

public class Add_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/add-digits/
	}

	public int addDigits(int num) {
		int digitSum = 0;
		while (num > 0) {
			digitSum += num % 10;
			num = num / 10;

			if (num == 0 && digitSum > 9) {
				num = digitSum;
				digitSum = 0;
			}
		}
		return digitSum;
	}

}

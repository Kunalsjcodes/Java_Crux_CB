package Leetcode;

public class Maximum_Number_of_Balls_in_a_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-number-of-balls-in-a-box/submissions/
	}

	public int countBalls(int lowLimit, int highLimit) {
		int[] count = new int[50];
		for (int i = lowLimit; i <= highLimit; i++) {

			int sum = 0, temp = i;
			while (temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			count[sum]++;
		}
		int result = 0;

		for (int i : count) {
			if (i > result) {
				result = i;
			}
		}
		return result;
	}

}

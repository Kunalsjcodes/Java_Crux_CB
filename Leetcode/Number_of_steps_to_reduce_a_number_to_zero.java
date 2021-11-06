package Leetcode;

public class Number_of_steps_to_reduce_a_number_to_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
	}

	public int numberOfSteps(int num) {
		int count = 0;
		while (num > 0) {
			if (num % 2 == 1)
				num--;
			else
				num /= 2;
			count++;
		}
		return count;
	}
}
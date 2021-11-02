package Leetcode;

public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/perfect-number/
	}

	public boolean checkPerfectNumber(int num) {
		if (num == 1)
			return false;

		int sum = 1;

		for (int i = 2; i <= Math.sqrt(num); ++i)
			if (num % i == 0)
				sum += i + num / i;

		return sum == num;
	}
}

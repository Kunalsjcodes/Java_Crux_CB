package Leetcode;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
	}

	public int subtractProductAndSum(int n) {
		int product = 1, sum = 0;
		while (n > 0) {
			product *= (n % 10);
			sum += (n % 10);
			n /= 10;
		}
		return product - sum;
	}
}

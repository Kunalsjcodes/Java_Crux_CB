package Leetcode;

public class Fibonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/fibonacci-number/
	}

	public int fib(int N) {
		Integer[] num = new Integer[N + 1];
		return Fib(num, N);
	}

	private int Fib(Integer[] num, int N) {
		if (num[N] != null) {
			return num[N];
		} else if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		}
		num[N] = Fib(num, N - 1) + Fib(num, N - 2);
		return num[N];
	}
}
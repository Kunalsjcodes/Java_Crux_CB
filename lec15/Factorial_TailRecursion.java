package lec15;

public class Factorial_TailRecursion {

	public static void main(String[] args) {
		System.out.println(fact_tail(5, 1));
	}

	public static int fact_tail(int n, int ans) {
		if (n == 0 || n == 1) {
			return ans;
		}

		// Tail-Recursion
		return fact_tail(n - 1, ans * n);

	}

}

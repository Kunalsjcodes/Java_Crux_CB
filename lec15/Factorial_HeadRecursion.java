package lec15;

public class Factorial_HeadRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact_head(5));
	}

	public static int fact_head(int n) {
		// Base Case
		if (n == 0 || n == 1) {
			return 1;
		}

		// Head-Recursion
		int fn = fact_head(n - 1);
		return n * fn;
	}

}

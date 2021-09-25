package lec03;

import java.util.*;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		int i = 1;
		System.out.print(a + " ");
		while (i <= n) {
			int c = a + b;
			a = b;
			b = c;
			i++;
			System.out.print(a + " "); // (if we want to print the full series)
		}
//		System.out.print(a + " "); // (if we want to print the Nth term of series)
	}

}

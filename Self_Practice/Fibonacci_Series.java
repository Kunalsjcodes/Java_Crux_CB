package Self_Practice;

import java.util.*;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of terms to display:- ");
		int n = sc.nextInt();

		int last = 0, next = 1, term, i;
		System.out.println("Fibonacci series upto  to " + n + " terms:- ");
		System.out.print(last + " " + next + " ");

		for (i = 3; i <= n; i++) {
			term = last + next;
			System.out.print(term + " ");
			last = next;
			next = term;
		}
	}

}

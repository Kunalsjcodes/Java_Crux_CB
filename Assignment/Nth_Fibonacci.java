package Assignment;

import java.util.*;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a = 0;
		int b = 1;
		int i = 1; 
		while (i <= N) {
			int c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.print(a + " "); 
	}

}

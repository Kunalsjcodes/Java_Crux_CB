package Assignment;

import java.util.*;

public class Pattern_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int a = 0;
		int b = 1;
		
		while (row <= n) {
			// star
			int cst = 1;
			while (cst <= nst) {
				System.out.print(a + "\t");
				int c = a + b;
				a = b;
				b = c;
				cst++;
				
			}
			// next row Pre
			row++;
			System.out.println();
			nst++;
		}
	}
}

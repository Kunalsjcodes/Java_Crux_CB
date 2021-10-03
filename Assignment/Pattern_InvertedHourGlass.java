package Assignment;

import java.util.*;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nsp = 2 * n - 1;
		int nst = 1;
		while (row <= 2 * n + 1) {
			int val = n;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + " ");
				cst++;
				val--;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			cst = 1;
			val++;
			if (row == n + 1) {

				val = 1;
				cst++;
			}
			while (cst <= nst) {

				System.out.print(val + " ");
				cst++;
				val++;
			}
			if (row <= n) {
				nsp -= 2;
				nst++;
			} else {
				nsp += 2;
				nst--;
			}

			row++;

			System.out.println();

		}
	}

}

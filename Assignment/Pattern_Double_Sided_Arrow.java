package Assignment;

import java.util.*;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int nsp1 = -1;
		int val;
		while (row <= n) {

			// space 1
			int csp = 1;

			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			// star 1
			int cst = 1;
			if (row <= n / 2) {
				val = row; 
			} else {
				val = n - row + 1;
			}

			while (cst <= nst) {

				System.out.print(val + " ");
				val--;
				cst++;
			}

			// space 2
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print("  ");
				csp1++;
			}

			// star 2
			int cst1 = 1;
			int val1 = 1;
			if (row == 1 || row == n) {
				cst1++;

			}
			while (cst1 <= nst) {
				System.out.print(val1 + " ");
				val1++;
				cst1++;

			}
			System.out.println();
			if (row <= n / 2) {
				nst++;
				nsp -= 2;
				nsp1 += 2;

			} else {
				nst--;
				nsp += 2;
				nsp1 -= 2;
				val--;
			}
			row++;
		}
	}

}

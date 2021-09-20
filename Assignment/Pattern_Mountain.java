package Assignment;
import java.util.*;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = 2 * n - 3;

		int row = 1;
		while (row <= n) {
			int val = 1;
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			int cst = 1;
			if (row == n) {
				cst = 2;
			}
			if (row < n) {
				val -= 1;
			} else {
				val -= 2;
			}
			for (; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val--;
			}

			System.out.println();
			row++;
			nsp = nsp - 2;
			nst++;
		}
	}

}

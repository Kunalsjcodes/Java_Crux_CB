//    1 
//  2 3 4 
//5 6 7 8 9 

package lec02;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val = 1;
		while (row <= n) {
			int csp = 1; // count of space
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val+" ");
				cst++;
				val++;
			}
			nst += 2;
			nsp--;
			row++;
			System.out.println();
		}
	}
}

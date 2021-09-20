//*****
//  ****
//    ***
//      **
//        *

package lec02;

public class Pattern_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=n; //number of stars
		int nsp=0; //number of space
		int row=1;
		
		while(row<=n) {
			//space
			int csp=1; //count of space
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//star
			int cst = 1; //count of star
			while (cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			//next line Prep.
			nst--;
			nsp+=2; // nsp= nsp+2
			row++;
			System.out.println();
		}
	}

}

package Assignment;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp=n-1;
		int row=1;
		
		while(row<=n) {
			int cst=1;
			while(cst<=nsp) {
				System.out.print("\t");
				cst++;
			}
			int csp=1;
			int val=row;
			while(csp<=(2*row)-1) {
				System.out.print(val + "\t");
				if(csp<=((2*(row)-1)/2)) {
					val++;
				}
				else {
					val--;
				}
				csp++;
			}
			row++;
			nsp--;
			System.out.println();
		}
	}

}

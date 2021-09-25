// 1 
// 1	1
// 1	2	1
// 1	3	3	1
// 1	4	6	4	1
// 1	5	10	10 	5 	1

package lec03;
import java.util.*;

public class Pascal_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int nst = 1;
		while (row < n) {
			int r = 0;
			int val=1;
			while (r < nst) {
				System.out.print(val+" ");
				val=((row-r)*(val))/(r+1);
				r++;

			}
			nst++;
			row++;
			System.out.println();
		}
	}

}

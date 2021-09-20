package Assignment;
import java.util.*;

public class Pattern_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			if (i > n / 2) {
				System.out.print(i + "\t");
				for (int k = 1; k <= i - 2; k++) {
					System.out.print("0\t");
				}
				System.out.print(i);
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print(i + "\t");
				}
			}
			System.out.println();
		}
	}
}

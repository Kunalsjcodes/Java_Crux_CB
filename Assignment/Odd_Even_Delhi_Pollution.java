package Assignment;

import java.util.Scanner;

public class Odd_Even_Delhi_Pollution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc != 0) {
			int n = sc.nextInt();
			// 12345
			int oddsum = 0, evensum = 0;
			while (n != 0) {
				// int rem = n%10;
				if ((n % 10) % 2 == 0) {
					evensum += n % 10;
				} else {
					oddsum += n % 10;
				}
				n /= 10;
			}
			if (evensum % 4 == 0 || oddsum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			tc--;
		}
	}
}

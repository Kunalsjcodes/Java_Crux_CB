package lec05;

import java.util.*;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1; // multiplier
		int ans = 0; // answer

		while (n != 0) {
			int rem = n % 2;
			ans = ans + rem * mul;
			n = n / 2;
			mul = mul * 10;
		}
		System.out.println(ans);
	}

}

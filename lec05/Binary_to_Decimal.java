package lec05;

import java.util.*;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul = 1; // multiplier
		int ans = 0; // answer

		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			n = n / 10;
			mul = mul * 2;
		}
		System.out.println(ans);
	}
}

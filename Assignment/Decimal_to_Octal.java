package Assignment;

import java.util.*;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		base10to8(n);
	}

	public static void base10to8(int n) {
		int mul = 1;
		int ans = 0;

		while (n != 0) {
			int rem = n % 8;
			ans = ans + rem * mul;
			n = n / 8;
			mul = mul * 10;
		}
		System.out.println(ans);
	}

}

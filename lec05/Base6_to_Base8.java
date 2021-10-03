package lec05;

import java.util.*;

public class Base6_to_Base8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = base6to10(n);
		base10to8(c);
	}

	public static int base6to10(int n) {
		int mul = 1; // multiplier
		int ans = 0; // answer

		while (n != 0) {
			int rem = n % 10; //modulas with destination
			ans = ans + rem * mul;
			n = n / 10; //divide with destination
			mul = mul * 6; //multiplication with source
		}
		return ans;
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

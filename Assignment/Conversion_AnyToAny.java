package Assignment;

import java.util.*;

public class Conversion_AnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int src = sc.nextInt();
		int des = sc.nextInt();
		int n = sc.nextInt();
		int c = srcto10(n, src);
		int ans = base10toDes(c, des);
		System.out.println(ans);
	}

	public static int srcto10(int n, int src) {
		int mul = 1;
		int ans = 0;

		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			n /= 10;
			mul *= src;
		}
		return ans;
	}

	public static int base10toDes(int n, int des) {
		int mul = 1;
		int ans = 0;

		while (n != 0) {
			int rem = n % des;
			ans = ans + rem * mul;
			n = n / des;
			mul = mul * 10;
		}
		return ans;
	}

}

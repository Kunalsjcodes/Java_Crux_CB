package Leetcode;

import java.util.*;

public class Three_Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/three-divisors/
		int t = 3;
		while (t != 0) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(isThree(num));
			t--;
		}
	}

	public static boolean isThree(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 3) {
			return true;
		}
		return false;

//		for (int i = 2; i * i <= n; i++) {
//			if (n % i == 0)
//				return i == n / i;
//		}
//		return false;
	}
}

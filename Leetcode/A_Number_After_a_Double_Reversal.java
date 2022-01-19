package Leetcode;

import java.util.*;

public class A_Number_After_a_Double_Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/a-number-after-a-double-reversal/
		int t = 3;
		while (t != 0) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(isSameAfterReversals(num));
			t--;
		}
	}

	public static boolean isSameAfterReversals(int num) {
		if (num == 0) {
			return true;
		}
		if (num % 10 == 0) {
			return false;
		} else {
			return true;
		}
	}

//	public static boolean isSameAfterReversals(int num) {
//		if (num == 0) {
//			return true;
//		}
//		int n1 = reverse(num);
//		int ans = reverse(n1);
//		return (ans == num);
//	}
//	
//	public static int reverse(int num) {
//		int rev = 0, rem = 0;
//		while (num > 0) {
//			rem = num % 10;
//			rev = rev * 10 + rem;
//			num /= 10;
//		}
//		return rev;
//	}
}

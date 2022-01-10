package Leetcode;

public class Roman_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/roman-to-integer/
	}

	public int romanToInt(String s) {
		int ans = 0;
		int val = 0;
		int pval = 10000;
		int l = s.length();
		for (int i = 0; i < l; i++) {
			char a = s.charAt(i);
			switch (a) {
			case 'I' -> val = 1;
			case 'V' -> val = 5;
			case 'X' -> val = 10;
			case 'L' -> val = 50;
			case 'C' -> val = 100;
			case 'D' -> val = 500;
			case 'M' -> val = 1000;
			}
			if (pval < val) {
				ans += -2 * pval;
			}
			ans += val;
			pval = val;
		}
		return ans;

	}
}

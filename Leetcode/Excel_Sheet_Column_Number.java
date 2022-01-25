package Leetcode;

public class Excel_Sheet_Column_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/excel-sheet-column-number/
	}

	public int titleToNumber(String columnTitle) {
		int base = (int) Math.pow(26, columnTitle.length() - 1);
		int ans = 0;
		for (char c : columnTitle.toCharArray()) {
			ans += base * (c - 'A' + 1);
			base /= 26;
		}
		return ans;
	}
}

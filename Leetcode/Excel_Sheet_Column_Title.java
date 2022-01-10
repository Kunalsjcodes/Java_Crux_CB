package Leetcode;

public class Excel_Sheet_Column_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/excel-sheet-column-title/
	}

	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n -= 1;
			int i = n % 26;
			n = n / 26;
			char c = (char) (i + 'A');
			sb.insert(0, c);
		}
		return sb.toString();
	}
}

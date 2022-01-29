package Leetcode;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/valid-parentheses/
	}

	public boolean isValid(String s) {
		int len = s.length();
		if (len == 0) {
			return true;
		} else if (len == 1) {
			return false;
		} else if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
			return false;
		} else if (s.charAt(len - 1) == '(' || s.charAt(len - 1) == '{' || s.charAt(len - 1) == '[') {
			return false;
		} else {
			int i = 0, j = 0;
			char[] arr = new char[len];
			arr[0] = s.charAt(0);

			for (i = 1; i < len; i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
					j++;
					arr[j] = s.charAt(i);
				} else if ((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && j == -1) {
					return false;
				} else {
					if ((s.charAt(i) == ']' && arr[j] == '[') || (s.charAt(i) == '}' && arr[j] == '{')
							|| (s.charAt(i) == ')' && arr[j] == '(')) {
						j--;
						continue;
					} else {
						return false;
					}
				}
			}
			if (j == -1) {
				return true;
			}
		}
		return false;
	}
}

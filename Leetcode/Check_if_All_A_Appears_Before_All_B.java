package Leetcode;

public class Check_if_All_A_Appears_Before_All_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
	}

	public boolean checkString(String s) {
		int n = s.length();
		boolean bFound = false;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'b')
				bFound = true;
			else if (bFound && s.charAt(i) == 'a')
				return false;
		}
		return true;
	}
}
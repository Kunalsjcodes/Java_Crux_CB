package Leetcode;

public class Maximum_Product_of_Word_Lengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/maximum-product-of-word-lengths/
	}

	class Solution {
		public int maxProduct(String[] words) {
			int ans = 0;
			for (int i = 0; i < words.length - 1; i++) {
				for (int j = i + 1; j < words.length; j++) {
					if (words[i].length() * words[j].length() > ans) {
						if (checkCommon(words[i], words[j])) {
							int val = words[i].length() * words[j].length();
							if (val > ans) {
								ans = val;
							}
						}
					}
				}
			}
			return ans;
		}

		public boolean checkCommon(String s1, String s2) {
			for (int i = 0; i < s1.length(); i++) {
				String s = "";
				s += s1.charAt(i);
				if (s2.contains(s)) {
					return false;
				}
			}
			return true;
		}
	}
}

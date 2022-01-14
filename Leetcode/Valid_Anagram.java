package Leetcode;
import java.util.*;
public class Valid_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/valid-anagram/
	}

	public boolean isAnagram(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			return true;
		} else {
			return false;
		}
	}
}

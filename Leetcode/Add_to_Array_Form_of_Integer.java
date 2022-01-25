package Leetcode;
import java.util.*;

public class Add_to_Array_Form_of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/add-to-array-form-of-integer/
	}

	public List<Integer> addToArrayForm(int[] num, int k) {
		int N = num.length;
		int cur = k;
		List<Integer> ans = new ArrayList();

		int i = N;
		while (--i >= 0 || cur > 0) {
			if (i >= 0)
				cur += num[i];
			ans.add(cur % 10);
			cur /= 10;
		}

		Collections.reverse(ans);
		return ans;
	}
}

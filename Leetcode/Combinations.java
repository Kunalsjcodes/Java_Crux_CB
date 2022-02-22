package Leetcode;

import java.util.*;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/combinations/
	}

	class Solution {
		List<List<Integer>> result;

		public List<List<Integer>> combine(int n, int k) {
			result = new ArrayList<>();
			helper(n, k, new ArrayList<>());
			return result;
		}

		public void helper(int n, int k, List<Integer> curr) {
			if (k == 0) {
				result.add(new ArrayList<>(curr));
				return;
			}
			if (n == 0)
				return;
			curr.add(n);
			helper(n - 1, k - 1, curr);
			curr.remove(curr.size() - 1);
			helper(n - 1, k, curr);
		}
	}
}

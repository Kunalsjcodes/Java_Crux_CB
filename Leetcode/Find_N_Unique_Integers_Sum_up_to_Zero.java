package Leetcode;

public class Find_N_Unique_Integers_Sum_up_to_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
	}

	public int[] sumZero(int n) {
		int[] ans = new int[n];
		if (n == 1) {
			return ans;
		}

		for (int i = 0; i < n / 2; i++) {
			ans[i] = i + 1;
			ans[n - 1 - i] = -(i + 1);
		}

		return ans;
	}
}

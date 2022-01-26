package Leetcode;
import java.util.*;
public class Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/count-primes/
	}

	public int countPrimes(int n) {
		if (n <= 2) {
			return 0;
		}
		boolean[] nums = new boolean[n];
		Arrays.fill(nums, true);
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (nums[i]) {
				count += 1;
				for (int j = 2; i * j < n; j++) {
					nums[i * j] = false;
				}
			}
		}
		return count;
	}

}

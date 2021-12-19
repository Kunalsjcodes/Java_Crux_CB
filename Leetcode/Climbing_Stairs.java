package Leetcode;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/climbing-stairs/
	}

	public int climbStairs(int n) {
		int prepre = 0, pre = 1;
		for (int i = 0; i < n; i++) {
			int tmp = prepre + pre;
			prepre = pre;
			pre = tmp;
		}
		return pre;
	}
}

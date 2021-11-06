package Leetcode;

public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
	}

	public int minCostToMoveChips(int[] position) {
		int even_cnt = 0;
		int odd_cnt = 0;
		for (int i : position) {
			if (i % 2 == 0) {
				even_cnt++;
			} else {
				odd_cnt++;
			}
		}
		return Math.min(odd_cnt, even_cnt);
	}
}
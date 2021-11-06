package Leetcode;

public class Water_Bottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/water-bottles/
	}

	public int numWaterBottles(int numBottles, int numExchange) {
		int ans = numBottles + (numBottles) / (numExchange - 1);
		if ((numBottles) % (numExchange - 1) == 0)
			ans--;
		return ans;
	}
}
package Leetcode;

public class Teemo_Attacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/teemo-attacking/
	}

	public int findPoisonedDuration(int[] timeSeries, int duration) {
		int n = timeSeries.length;
		if (n == 0)
			return 0;

		int total = 0;
		for (int i = 0; i < n - 1; ++i)
			total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
		return total + duration;
	}
}

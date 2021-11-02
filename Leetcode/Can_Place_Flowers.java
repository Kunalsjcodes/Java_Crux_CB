package Leetcode;

public class Can_Place_Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/can-place-flowers/
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (flowerbed == null || n > flowerbed.length / 2 + 1)
			return false;
		int count = 0;
		for (int i = 0; i < flowerbed.length && count < n; i++) {
			if (flowerbed[i] == 0) {
				int prev = i == 0 ? 0 : flowerbed[i - 1];
				int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
				if (prev == 0 && next == 0) {
					flowerbed[i] = 1;
					count++;
				}
			}
		}
		return count == n;
	}
}

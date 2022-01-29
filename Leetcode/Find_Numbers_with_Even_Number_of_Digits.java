package Leetcode;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
	}

	public int findNumbers(int[] nums) {
		int even = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			int temp = nums[i];
			while (temp != 0) {
				temp = temp / 10;
				count++;
			}
			if (count % 2 == 0) {
				even++;
			}
		}
		return even;
	}
}

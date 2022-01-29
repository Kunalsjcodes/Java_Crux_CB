package Leetcode;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (j != i && nums[j] < nums[i]) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;
	}

}

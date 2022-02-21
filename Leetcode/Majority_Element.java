package Leetcode;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/majority-element/
	}

	public int majorityElement(int[] nums) {
		int majorityCount = nums.length / 2;

		for (int num : nums) {
			int count = 0;
			for (int elem : nums) {
				if (elem == num) {
					count += 1;
				}
			}

			if (count > majorityCount) {
				return num;
			}

		}

		return -1;
	}

}

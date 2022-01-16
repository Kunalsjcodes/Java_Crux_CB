package Leetcode;

public class Two_Sum_II_Input_Array_Is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
	}

	public int[] twoSum(int[] numbers, int target) {
		int low = 0, high = numbers.length - 1;
		while (low < high) {
			int sum = numbers[low] + numbers[high];
			if (sum == target) {
				return new int[] { low + 1, high + 1 };
			} else if (sum < target) {
				low += 1;
			} else {
				high -= 1;
			}
		}
		return new int[] { -1, -1 };
	}
}

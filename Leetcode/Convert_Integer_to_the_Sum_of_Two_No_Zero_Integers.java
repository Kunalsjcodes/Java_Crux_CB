package Leetcode;

public class Convert_Integer_to_the_Sum_of_Two_No_Zero_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
	}

	public int[] getNoZeroIntegers(int n) {
		int[] result = new int[2];
		int left = 1;
		int right = n - 1;
		while (left <= right) {
			if (check(left) && check(right)) {
				result[0] = left;
				result[1] = right;
				break;
			}
			left++;
			right--;
		}
		return result;
	}

	private boolean check(int val) {
		while (val != 0) {
			int temp = val % 10;
			if (temp == 0)
				return false;
			val /= 10;
		}
		return true;
	}

}

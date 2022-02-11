package Leetcode;

public class Duplicate_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/duplicate-zeros/
	}

	public void duplicateZeros(int[] arr) {
		int[] result = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp < arr.length) {
				if (arr[i] != 0) {
					result[temp] = arr[i];
					temp++;
				} else {
					result[temp] = 0;
					temp += 1;
					if (temp < arr.length)
						result[temp] = 0;
					temp++;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
	}

}

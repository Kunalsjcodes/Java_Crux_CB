package Leetcode;

public class Peak_Index_in_a_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/peak-index-in-a-mountain-array/
	}

	public int peakIndexInMountainArray(int[] arr) {
		int i = 0;
		while (arr[i] < arr[i + 1]) {
			i++;
		}
		return i;
	}
}

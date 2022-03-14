package Leetcode;

import java.util.*;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
	}

	public int kthSmallest(int[][] matrix, int k) {
		int index = 0;
		int arr[] = new int[matrix.length * matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				arr[index] = matrix[i][j];
				index++;
			}
		}
		Arrays.sort(arr);
		return arr[k - 1];
	}
}

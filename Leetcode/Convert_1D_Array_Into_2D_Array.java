package Leetcode;

public class Convert_1D_Array_Into_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/convert-1d-array-into-2d-array/
	}

	public int[][] construct2DArray(int[] original, int m, int n) {
		int[][] arr1 = new int[0][0];
		if (m * n != original.length) {
			return arr1;
		}
		int[][] arr = new int[m][n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = original[k];

				k++;
			}
		}
		return arr;
	}

}

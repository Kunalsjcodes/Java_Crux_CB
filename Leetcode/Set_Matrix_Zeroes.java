package Leetcode;

public class Set_Matrix_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/set-matrix-zeroes/
	}

	public void setZeroes(int[][] matrix) {

		boolean row = false;
		boolean col = false;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				row = true;
				break;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				col = true;
				break;
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length && row; i++) {
			matrix[i][0] = 0;
		}

		for (int i = 0; i < matrix[0].length && col; i++) {
			matrix[0][i] = 0;
		}
	}

}

package Leetcode;

public class Reshape_the_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/reshape-the-matrix/
	}

	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int a = mat.length;
		int b = mat[0].length;
		int n = r * c;
		int m = a * b;
		int count = 0;
		int rowcount = 0;
		if (m == n) {
			int[][] mat2 = new int[r][c];

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					mat2[rowcount][count] = mat[i][j];
					count = count + 1;
					if (count == c) {
						rowcount = rowcount + 1;
						count = 0;

					}

				}
			}
			return mat2;
		} else {
			return mat;
		}
	}
}

package Leetcode;

public class Transpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/transpose-matrix/
	}

	public int[][] transpose(int[][] matrix) {
		int Row = matrix.length, Col = matrix[0].length;
		int[][] ans = new int[Col][Row];
		for (int r = 0; r < Row; ++r)
			for (int c = 0; c < Col; ++c) {
				ans[c][r] = matrix[r][c];
			}
		return ans;
	}
}
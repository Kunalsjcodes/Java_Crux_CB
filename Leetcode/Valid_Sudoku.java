package Leetcode;

public class Valid_Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/valid-sudoku/
	}

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.') {
					if (isValid(board, board[i][j], i, j)) {
						continue;
					}
					return false;
				}
			}
		}
		return true;
	}

	public boolean isValid(char[][] board, char c, int row, int col) {
		for (int i = 0; i < 9; i++) {
			if (i != col && board[row][i] == c) {
				return false;
			}
			if (i != row && board[i][col] == c) {
				return false;
			}
			if (row != (row / 3 * 3 + i / 3) && col != (col / 3 * 3 + i % 3)
					&& board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == c) {
				return false;
			}
		}
		return true;
	}
}

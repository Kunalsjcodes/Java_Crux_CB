package Leetcode;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/word-search/
	}
	
    public boolean exist(char[][] grid, String word) {
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				boolean ans = Word_search(grid, word, j, i, 0);
				if (ans == true) {
					return ans;
				}
			}

		}
		return false; 
    }
    
    	public static boolean Word_search(char[][] grid, String word, int cc, int cr, int idx) {
		// TODO Auto-generated method stub

		if (idx == word.length()) {
			return true;
		}

		if (cc < 0 || cc >= grid[0].length || cr < 0 || cr >= grid.length || grid[cr][cc] != word.charAt(idx)) {
			return false;

		}
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };

		grid[cr][cc] = '*';

		for (int i = 0; i < c.length; i++) {
			boolean ans = Word_search(grid, word, cc + c[i], cr + r[i], idx + 1);
			if (ans) {
				return ans;
			}

		}
		grid[cr][cc] = word.charAt(idx);

		return false;
	}

}

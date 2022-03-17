
public class Score_of_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/score-of-parentheses/
	}

	public int scoreOfParentheses(String s) {
		int score = 0, c = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				if (s.charAt(i + 1) == ')')
					score += c;
				c <<= 1;
			} else {
				c >>= 1;
			}
		}
		return score;
	}
}

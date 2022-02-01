package Leetcode;

public class Goal_Parser_Interpretation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/goal-parser-interpretation/
	}

	public String interpret(String command) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G') {
				str.append("G");
			}

			else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				str.append("o");
				i++;
			}

			else {
				str.append("al");
				i = i + 3;
			}
		}
		return str.toString();
	}
}

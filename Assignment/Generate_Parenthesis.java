package Assignment;

import java.util.*;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GenerateParentheses(n, "", 0, 0);
	}

	public static void GenerateParentheses(int n, String ans, int open, int close) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (close < open) {
			GenerateParentheses(n, ans + ")", open, close + 1);
		}
		
		if (open < n) {
			GenerateParentheses(n, ans + "(", open + 1, close);
		}
	}
}
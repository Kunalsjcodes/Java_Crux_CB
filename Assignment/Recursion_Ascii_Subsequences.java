package Assignment;
import java.util.*;
public class Recursion_Ascii_Subsequences {
	static int count = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		subsequence(str, "");
		System.out.print("\n" + count);
	}

	public static void subsequence(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		char ch = ques.charAt(0);
		subsequence(ques.substring(1), ans);
		subsequence(ques.substring(1), ans + ch);
		subsequence(ques.substring(1), ans + (int) ch);

	}
}
package lec16;

public class SubSeq_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Subseq(str, "");
	}

	public static void Subseq(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		Subseq(str.substring(1), ans);
		Subseq(str.substring(1), ans + ch);

	}

}

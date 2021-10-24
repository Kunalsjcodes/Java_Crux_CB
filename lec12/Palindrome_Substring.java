package lec12;

public class Palindrome_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		Palindrome(str);
	}

	public static void Palindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				if (Is_pal(s)) {
					System.out.println(s);
				}
			}
			System.out.println();
		}
	}

	public static boolean Is_pal(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
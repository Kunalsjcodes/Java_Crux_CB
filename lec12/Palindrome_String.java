package lec12;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kunal";
		System.out.println(Palindrome(str));

	}

	public static boolean Palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		int k = 0;
		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
}

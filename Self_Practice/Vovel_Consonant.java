package Self_Practice;

import java.util.*;

public class Vovel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an alphabet: ");
		String str = sc.next();

		boolean LowerCase = str.charAt(0) >= 97 && str.charAt(0) <= 122;
		boolean UpperCase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
		boolean vowel = str.equals("a") || str.equals("A") || str.equals("e") || str.equals("E") || str.equals("i")
				|| str.equals("I") || str.equals("o") || str.equals("O") || str.equals("u") || str.equals("U");

		if (str.length() > 1) {
			System.out.println("Not a single letter!");
		} else if (!(LowerCase || UpperCase)) {
			System.out.println("Not an alphabet");
		} else if (vowel) {
			System.out.println("Input letter is Vowel");
		} else {
			System.out.println("Input letter is Consonant");
		}

	}

}

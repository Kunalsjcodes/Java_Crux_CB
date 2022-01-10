package Self_Practice;

import java.util.*;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string to reverse:- ");
		String str = sc.next();
		String RevStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			RevStr = RevStr + str.charAt(i);
		}

		System.out.println("Reversed string is:- " + RevStr);
	}

}

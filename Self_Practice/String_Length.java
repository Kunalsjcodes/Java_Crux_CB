package Self_Practice;

import java.util.*;

public class String_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string:- ");
		String str = sc.next();
		
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			count++;
		}
		System.out.println("The string contains " + count + " number of characters.");
		System.out.println("So, the length of the string " + str + " is:- " + count);
	}

}

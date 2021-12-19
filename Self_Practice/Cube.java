package Self_Practice;

import java.util.*;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of terms:- ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Number is " + i + " and cube of the " + i + " is:- " + (i * i * i));
		}

	}

}

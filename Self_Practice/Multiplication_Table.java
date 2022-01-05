package Self_Practice;

import java.util.*;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number (Table to be calculated):- ");
		int n = sc.nextInt();
		System.out.print("Input number of terms:- ");
		int m = sc.nextInt();

		for (int i = 0; i <= m; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
	}
}

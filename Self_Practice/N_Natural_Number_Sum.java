package Self_Practice;

import java.util.*;

public class N_Natural_Number_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number:- ");
		int n = sc.nextInt();

		System.out.println("The first " + n + " natural number are:- ");

		int i, sum = 0;
		for (i = 1; i <= n; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("The Sum of Natural Number upto " + n + " terms : " + sum);
	}

}

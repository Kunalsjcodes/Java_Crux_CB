package Self_Practice;

import java.util.*;

public class n_Even_Number_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number of terms:- ");
		int n = sc.nextInt();
		
		int i, sum = 0;
		System.out.print("The even numbers are:- ");
		for (i = 1; i <= n; i++) {
			System.out.print(2 * i + " ");
			sum += 2 * i;
		}
		System.out.println();
		System.out.println("The Sum of Even Natural Number upto " + n + " terms:- " + sum);
	}

}

package Self_Practice;

import java.util.*;

public class n_Square_Number_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of terms:- ");
		int n = sc.nextInt();

		int i, sum = 0;
		System.out.print("The Square Number upto " + n + " terms are:- ");
		for (i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
			sum += (i * i);
		}
		System.out.println();
		System.out.print("The Sum of Square Natural Number upto " + n + " terms = " + sum);

	}

}

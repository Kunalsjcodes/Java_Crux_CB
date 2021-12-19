package Self_Practice;

import java.util.*;

public class Sum_and_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any 5 number:- ");

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();

			sum += n;
		}
		System.out.println("The sum of 5 no. is:- " + sum);

		double avg = 0;
		avg = sum / 5;
		System.out.println("The Average of 5 no. is:- " + avg);
	}
}

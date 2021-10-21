package Assignment;

import java.util.*;

public class Revising_Quadratic_Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x1 = (int) ((-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
		int x2 = (int) ((-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a);

		if (((b * b) - 4 * a * c) < 0) {
			System.out.println("Imaginary");
		} else if (x1 == x2) {
			System.out.println("Real and Equal");
			System.out.println(x1 + " " + x2);
		} else {
			System.out.println("Real and Distinct");
			if (x1 > x2) {
				System.out.println(x2 + " " + x1);
			}
		}
	}
}

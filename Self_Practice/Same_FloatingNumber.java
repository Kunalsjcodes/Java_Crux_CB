package Self_Practice;

import java.util.*;

public class Same_FloatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input floating-point number:- ");
		float a = sc.nextFloat();
		System.out.print("Input another floating-point number:- ");
		float b = sc.nextFloat();

		if (a == b) {
			System.out.println("They are same");
		} else {
			System.out.println("They are different");
		}
	}

}

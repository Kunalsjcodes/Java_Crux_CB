package Assignment;

import java.util.*;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long Null = 1;
		long NewNumber = 0;
		while (n > 0) {
			int rem = (int) (n % 10);
			int x = 9 - rem;
			if (n == 9) {
				NewNumber = NewNumber + (rem * Null);
			} else if (x < rem) {
				NewNumber = NewNumber + (x * Null);
			} else {
				NewNumber = NewNumber + (rem * Null);
			}
			Null *= 10;
			n /= 10;
		}
		System.out.print(NewNumber);
	}
}

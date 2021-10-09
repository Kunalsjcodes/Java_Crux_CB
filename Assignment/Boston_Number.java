package Assignment;

import java.util.*;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int sum = 0;
		int s = sumofn(n);

		while (i <= n) {
			if (n % i == 0) {
				sum += sumofn(i);
				n /= i;
			} else {
				i++;
			}
		}
		if (s == sum)
			System.out.println(1);
		else
			System.out.println(0);
	}

	public static int sumofn(int n) {
		int sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}
}

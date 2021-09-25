package lec03;

import java.util.*;

public class Inverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int place = 1;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			int k = (int) (place * Math.pow(10, (rem - 1)));
			sum += k;
			n /= 10;
			place++;
		}
		System.out.println(sum);
	}
}
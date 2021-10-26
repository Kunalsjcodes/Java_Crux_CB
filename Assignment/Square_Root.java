package Assignment;

import java.util.Scanner;

public class Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(mySqrt(x));
	}

	public static int mySqrt(int x) {
		int left = 1, right = x / 2;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (mid > x / mid) {
				right = mid - 1;
				continue;
			}
			if ((mid + 1) <= x / (mid + 1)) {
				left = mid + 1;
				continue;
			}
			return mid;
		}
		return x;
	}
}

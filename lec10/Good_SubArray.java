package lec10;

import java.util.*;

public class Good_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc != 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int count = 0, sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					sum += arr[i];
					if (sum % n == 0) {
						count++;
					}
				}
				sum=0;
			}
			System.out.println(count);
			tc--;
		}
	}

}

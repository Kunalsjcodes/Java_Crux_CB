package Assignment;

import java.util.*;

public class Form_Biggest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
			form_biggest(arr);
		}

	}

	public static void form_biggest(int[] arr) {
		String sij = "";
		String sji = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				sij = String.valueOf(arr[i]) + String.valueOf(arr[j]);
				sji = String.valueOf(arr[j]) + String.valueOf(arr[i]);
				if (Long.parseLong(sij) < Long.parseLong(sji)) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		String ans = "";

		for (int i = 0; i < arr.length; i++) {
			ans += String.valueOf(arr[i]);

		}
		if (Integer.parseInt(ans.charAt(0) + "") == 0) { // CHECK THIS
			System.out.println("0");
		} else {
			System.out.println(ans);
		}
	}
}

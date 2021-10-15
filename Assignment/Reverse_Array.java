package Assignment;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		rev(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void rev(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

			i++;
			j--;
		}
	}
}

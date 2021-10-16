package Assignment;

import java.util.Scanner;

public class Inverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[n];
		
		for (int k=0; k<n; k++) {
			int val=arr[k];
			arr2[val]=k;
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
	
}

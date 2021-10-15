package Assignment;

import java.util.Scanner;

public class Max_Value_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Max_Value(arr);
		System.out.println(max);
	}

	public static int Max_Value(int[] arr) {
		 int max = arr[0];
		 int i=0;
	        
         for (i = 1; i < arr.length; i++) {
             if (arr[i] > max)
                 max = arr[i];        	 
         }
         return max;
	}

}

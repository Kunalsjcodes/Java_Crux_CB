package lec09;

import java.util.*;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[1][2]);
		int[] other = arr[0];

		int row = arr.length;
		int col = arr[0].length;
		arr[2][3] = 50;
		// print
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

}

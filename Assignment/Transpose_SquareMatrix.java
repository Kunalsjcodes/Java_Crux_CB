package Assignment;

import java.util.Scanner;

public class Transpose_SquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row;
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Tranpose(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}

	public static void Tranpose(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr.length; col++) {
				int t = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = t;

			}

		}
	}

}

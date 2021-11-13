package Assignment;
import java.util.*;
public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		wave_print(arr);

	}

	public static void wave_print(int[][] arr) {
		int min_row = 0;
		int min_col = 0;
		int max_row = arr.length - 1;
		int max_col = arr[0].length - 1;
		for (int i = min_row; i <= max_row; i++) {
			if (i % 2 == 0) {
				for (int j = min_col; j <= max_col; j++) {
					System.out.print(arr[i][j] + ", ");
				}

			} else {
				for (int j = max_col; j >= min_col; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.print("END");

	}
}
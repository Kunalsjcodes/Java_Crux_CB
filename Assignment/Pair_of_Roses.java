package Assignment;
import java.util.*;

public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			int rs = sc.nextInt();
			pair_of_roses(arr, rs);
			// System.out.println();
			t--;
		}
	}

	public static void pair_of_roses(int[] arr, int rs) {
		int n = arr.length;
		int rose1 = 0, rose2 = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] + arr[j] == rs) {
					int diff = Math.abs(arr[i] - arr[j]);
					if (diff <= min) {
						min = diff;
						if (arr[i] < arr[j]) {
							rose1 = arr[i];
							rose2 = arr[j];
						} else {
							rose1 = arr[j];
							rose2 = arr[i];
						}
					}
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
	}
}

package Assignment;

import java.util.*;

public class Recursion_Subset_problem {
	public static int count = 0;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int target = in.nextInt();
		second(arr, target, n);
		System.out.println();
		System.out.println(count);
	}

	public static void second(int arr[], int target, int n) {
		int sum = 0;
		List<Integer> l = new ArrayList<>();
		rec_fun(arr, 0, l, sum, target);
	}

	public static void rec_fun(int arr[], int n, List<Integer> l, int sum, int target) {
		if (n == arr.length) {
			if (sum == target) {
				count++;
				for (int i = 0; i < l.size(); i++) {
					System.out.print(l.get(i) + " ");

				}

				return;
			}

			return;
		}
		l.add(arr[n]);
		rec_fun(arr, n + 1, l, sum + arr[n], target);
		l.remove(l.size() - 1);
		rec_fun(arr, n + 1, l, sum, target);

	}

}
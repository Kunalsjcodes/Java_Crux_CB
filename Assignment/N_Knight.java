package Assignment;

import java.util.*;

public class N_Knight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean a[][] = new boolean[n][n];
		Nknight(a, n, 0, 0, "");
		System.out.println();
		System.out.println(NknightCount(a, n, 0, 0, ""));

	}

	public static void Nknight(boolean a[][], int n, int cr, int cc, String ans) {

		if (n == 0) {
			System.out.print(ans);
			return;
		}

		for (int i = cr; i < a.length; i++) {
			int j = cc;
			if (i != cr) {
				j = 0;
			}
			for (; j < a[0].length; j++) {
				if (is_safe(a, i, j)) {
					a[i][j] = true;
					Nknight(a, n - 1, i, j, ans + "{" + i + "-" + j + "}" + " ");
					a[i][j] = false;
				}
			}
		}
	}

	public static int NknightCount(boolean a[][], int n, int cr, int cc, String ans) {
		int count = 0;
		
		if (n == 0) {
			return 1;
		}

		
		for (int i = cr; i < a.length; i++) {
			int j = cc;
			if (i != cr) {
				j = 0;
			}
			for (; j < a[0].length; j++) {
				if (is_safe(a, i, j)) {
					a[i][j] = true;
					count+= NknightCount(a, n - 1, i, j, ans + "{" + i + "-" + j + "}" + " ");
					a[i][j] = false;
				}
			}
		}
		return count;
	}
	
	public static boolean is_safe(boolean a[][], int r1, int c1) {
		if (a[r1][c1])
			return false;
		int r[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
		int c[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
		for (int i = 0; i < r.length; i++) {
			int pos1 = r1 - r[i];
			int pos2 = c1 - c[i];
			if (pos1 < 0 || pos2 < 0 || pos1 >= a.length || pos2 >= a[0].length)
				continue;
			if (a[pos1][pos2])
				return false;
		}
		return true;

	}
}
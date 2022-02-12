package Leetcode;

public class Check_If_It_Is_a_Straight_Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://leetcode.com/problems/check-if-it-is-a-straight-line/
	}

	public boolean checkStraightLine(int[][] coordinates) {
		int len = coordinates.length;

		for (int i = 1; i < len - 1; i++) {
			int[] a = coordinates[i - 1]; // (x1,y1) == (a[0],a[1])
			int[] b = coordinates[i]; // (x2,y2) == (b[0],b[1])
			int[] c = coordinates[i + 1]; // (x3,y3) == (c[0],c[1])

			boolean operation = (b[1] - a[1]) * (c[0] - b[0]) == (c[1] - b[1]) * (b[0] - a[0]);
			if (operation != true) {
				return false;
			}
		}
		return true;
	}
}

// ALGORITHM:
// I could take slope of first 2 points & then find slope of next pairs
// if there is change of slope, then it means those points are not in straight
// line
// So, then I could return false.

// But this approach faces problem when points are vertical... where slope is
// infinity.

// instead of equating slopes for every 2 points... like below
// (y2-y1)/(x2-x1) = (y3-y2)/(x3-x2)
// above causes problem due to division by zero when points are vertical.
// So take multiplication like below

// (y2-y1)*(x3-x2) = (y3-y2)*(x2-x1)
// This will do the same operation and eliminate division by zero problem.

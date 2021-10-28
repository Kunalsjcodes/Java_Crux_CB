package Assignment;
import java.util.*;
public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			long n = s.nextLong();
			long k = s.nextLong();

			System.out.println(Kth_root(n, k));
			t--;
		}
	}

	public static long Kth_root(long n, long k) {
		long lo = 0;
		long hi = Long.MAX_VALUE;
		long ans = -1;

		while (lo <= hi) {
			long mid = (lo + hi) / 2;

			if ((long) Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		return ans;
	}
}
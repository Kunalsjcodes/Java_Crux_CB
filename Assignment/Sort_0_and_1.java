package Assignment;
import java.util.*;
public class Sort_0_and_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0, j = 0;
		int a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int c = a[0];
		for (i = 0; i < n; i++) {
			if (a[i] > c)
				c = a[i];
		}
		int b[] = new int[c + 1];
		for (j = 0; j <= c; j++) {
			b[j] = 0;
			for (i = 0; i < n; i++) {
				if (a[i] == j)
					b[j]++;
			}
		}
		int as[] = new int[n];
		j = 0;
		for (i = 0; i <= c; i++) {

			while (b[i] != 0 && j < n)

			{

				as[j] = i;

				b[i]--;
				System.out.print(as[j] + " ");
				j++;
			}
		}

	}
}
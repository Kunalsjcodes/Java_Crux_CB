package Assignment;
import java.util.*;
public class Pattern_Hollow_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		int j;
		while (i <= n) {

			j = 1;
			while (j++ <= n - i)

			{
				System.out.print(" ");
			}

			if (i == 1 || i == n) {
				j = 1;
				while (j <= n)

				{
					System.out.print("*");
					j++;
				}
			} else {
				j = 1;
				while (j <= n) {
					if (j == 1 || j == n)
						System.out.print("*");
					else
						System.out.print(" ");
					j++;
				}
			}
			System.out.println();
			i++;

		}
	}

}

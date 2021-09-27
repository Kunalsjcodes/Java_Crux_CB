package Assignment;
import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt(); // Divident
		int N2 = sc.nextInt(); // Divisor

		while (N1 % N2 != 0) {
			int rem = N1 % N2;
			N1 = N2;
			N2 = rem;
		}
		System.out.println(N2);
	}

}

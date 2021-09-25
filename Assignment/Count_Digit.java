package Assignment;
import java.util.*;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int d = sc.nextInt();
		while (n != 0) {
			int rem = n % 10;
			if (rem == d) {
				count++;
			}
			n /= 10; // n=n/10
		}
		System.out.println(count);
	}
}

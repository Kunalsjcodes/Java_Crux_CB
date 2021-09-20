package Assignment;
import java.util.*;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factor = 0;
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				factor++;
				break;
			}
			i++;
		}
		if (factor == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

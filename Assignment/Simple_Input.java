package Assignment;

import java.util.*;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (sum >= 0) {
			int n = sc.nextInt();
			sum += n;
			if (sum >= 0)
				System.out.println(n);
		}
	}
}

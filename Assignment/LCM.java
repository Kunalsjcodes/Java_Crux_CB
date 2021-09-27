package Assignment;

import java.util.*;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int i = 1;
		while (true) {
			if (i % N1 == 0 && i % N2 == 0)
				break;
			i++;
		}
		System.out.println(i);

//		int X1 = N1, X2 = N2;
//		while (X1 % X2 != 0) {
//			int rem = X1 % X2;
//			X1 = X2;
//			X2 = rem;
//		}
//		System.out.println("HCF: " + X2);
//		int LCM = (N1 * N2) / X2;
//		System.out.println("LCM: " + LCM);

	}
}

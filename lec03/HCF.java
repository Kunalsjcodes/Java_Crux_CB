package lec03;

import java.util.*;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divident:- ");
		int divident = sc.nextInt();
		System.out.println("Enter Divisor:- ");
		int divisor = sc.nextInt();
		
		while(divident%divisor!=0){
			int rem = divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println(divisor);
	}

}

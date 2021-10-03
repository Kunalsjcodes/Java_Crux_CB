package lec05;

import java.util.*;

public class Anybase_to_Anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = sc.nextInt(); 
		System.out.print("Enter Source Base: ");
		int src = sc.nextInt();
		System.out.print("Enter Destination Base: ");
		int des = sc.nextInt();
		int c= srcto10(n,src);
		int ans= base10toDes(c, des);
		System.out.println("For Number "+n+", Base "+src+" to Base "+des+" is: " + ans);
	}
	
	public static int srcto10(int n, int src) {
		int mul = 1; 
		int ans = 0; 

		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			n/= 10; 
			mul*=src;
		}
		return ans;
	}
	
	public static int base10toDes(int n, int des){
		int mul = 1; 
		int ans = 0; 

		while (n != 0) {
			int rem = n % des; 
			ans = ans + rem * mul;
			n = n / des;
			mul = mul * 10;
		}
		return ans;
	}

}

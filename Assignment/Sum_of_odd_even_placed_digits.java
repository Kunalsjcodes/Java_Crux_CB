package Assignment;

import java.util.*;

public class Sum_of_odd_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd_sum=0, even_sum=0;
		int i=1;
		
		while(n!=0) {
			if(i%2==0) {
				even_sum+=n%10;
			}
			else {
				odd_sum+=n%10;
			}
			n/=10;
			i++;
		}
		System.out.println(odd_sum);
		System.out.println(even_sum);
	}
}

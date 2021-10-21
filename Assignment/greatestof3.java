package Assignment;

import java.util.Scanner;

public class greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a<b) && (b<c)) {
			System.out.println(a + " " + b + " " + c);
		}
		else if((a>b)&&(c>a)) {
			System.out.println(b + " " + a + " " + c);
		}
		else if((b<c)&&(c<a)) {
			System.out.println(b + " " + c + " " + a);
		}
		else if((a<c)&&(c<b)) {
			System.out.println(a + " " + c + " " + b);
		}
		else if((c<b)&&(b<a)) {
			System.out.println(c + " " + b + " " + a);
		}
		else if((a<c)&&(a<b)) {
			System.out.println(c + " " + a + " " + b);
		}
	}
}
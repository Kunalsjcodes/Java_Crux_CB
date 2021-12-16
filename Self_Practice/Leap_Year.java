package Self_Practice;
import java.util.*;
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = sc.nextInt();
		
		if(year%4==0) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		
	}

}

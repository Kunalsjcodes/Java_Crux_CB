package Self_Practice;

import java.util.*;

public class Days_in_Month_acc_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a month number:- ");
		int month = sc.nextInt();
		System.out.print("Input a year:- ");
		int year = sc.nextInt();

		if (year % 4 == 0 && month == 2) {
			System.out.println("Februrary " + year + " has 29 days");
		} else {
			switch (month) {
				case 1: {
					System.out.println("January " + year + " has 31 days");
					break;
				}
				case 2: {
					System.out.println("Februrary " + year + " has 28 days");
					break;
				}
				case 3: {
					System.out.println("March " + year + " has 31 days");
					break;
				}
				case 4: {
					System.out.println("April " + year + " has 30 days");
					break;
				}
				case 5: {
					System.out.println("May " + year + " has 31 days");
					break;
				}
				case 6: {
					System.out.println("June " + year + " has 30 days");
					break;
				}
				case 7: {
					System.out.println("July " + year + " has 31 days");
					break;
				}
				case 8: {
					System.out.println("August " + year + " has 31 days");
					break;
				}
				case 9: {
					System.out.println("September " + year + " has 30 days");
					break;
				}
				case 10: {
					System.out.println("October " + year + " has 31 days");
					break;
				}
				case 11: {
					System.out.println("November " + year + " has 30 days");
					break;
				}
				case 12: {
					System.out.println("December " + year + " has 31 days");
					break;
				}
				default: {
					System.out.println("Invalid Month Number");
					break;
				}
			}
		}
	}
}

package Assignment;
import java.util.*;
public class Recursion_Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		/*
		T1:- Source (Src)
		T2:- Destination (Des)
		T3:- Helper(Hlp)
		*/
		Toh(n, "T1", "T3", "T2");
		System.out.println(count(n, "T1", "T3", "T2")-1);

	}

	public static void Toh(int n, String T1, String T3, String T2) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		

		Toh(n - 1, T1, T2, T3);
		System.out.println("Move " + n + "th disc from " + T1 + " to " + T2);
		Toh(n - 1, T3, T1, T2);
	}

	public static int count(int n, String T1, String T3, String T2) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		}
		int Cou =0;

		Cou += count(n - 1, T1, T2, T3);
		//System.out.println("Move " + n + "th disc from " + T1 + " to " + T2);
		Cou += count(n - 1, T3, T1, T2);
		
		return Cou;
	}
	
}

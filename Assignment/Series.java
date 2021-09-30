package Assignment;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0, n=1;
		
		while(count!=n1) {
			int k=(3*n)+2;
			if(k%n2!=0) {
				System.out.println(k);
				count++;
			}
			n++;
		}
	}
}

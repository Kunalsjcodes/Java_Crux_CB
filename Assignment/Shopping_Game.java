package Assignment;
import java.util.*;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc != 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int i=1;
			
			while(M>0 && N>0) {
				M-=i;
				i++;
				N-=i;
				i++;
				
				if(M<=0) {
					System.out.println("Harshit");
					break;
				}
				if(N<=0) {
					System.out.println("Aayush");
					break;
				}
			}
			tc--;
		}
	}

}

package Assignment;
import java.util.*;
public class Pattern_Mirror_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
				int nsp=n/2; 
				int nst=1; 
				int row=1; 
				while(row<=n) {
					int csp=1; 
					while(csp<=nsp) {
						System.out.print("\t"); 
						csp++;
					} 
					int cst=1;  
				  
					while(cst<=nst) { 
					
						System.out.print("*\t"); 
						cst++;
					}  
				  
					if(row<=n/2) {
						nsp--; 
						nst=nst+2;
				  }  
					else {
					nsp++; 
				 
					nst=nst-2; 
					}
					row++; 
					System.out.println();
				}
		    }
	}
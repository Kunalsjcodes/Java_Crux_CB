package Assignment;

import java.util.*;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int row=1;  
        int nsp=0; 
        int nst=2*n+1; 
        int val=n+1;
        while(row<=2*n+1) {  
        	int csp=1;
        	while(csp<=nsp) {
        		System.out.print("  ");
        		csp++;
        	}
        	
        	int cst=1;  
        	while(cst<=nst) { 
        		if(cst<=nst/2+1) { 
        			val--;
        			System.out.print(val+" "); 
        			
        		} else { 
        			val++;
        			System.out.print(val+" "); 
        			
        		}
        		
        		cst++;
        	}  
        	if(row<n+1) {
        		nsp++; 
        		nst=nst-2; 
        		
        	} 
        	else {  
        		val=val+2;
        		nsp--; 
        		nst=nst+2; 
        	
        		
        	}
        	row++;
        	System.out.println();
        }
    }
}      
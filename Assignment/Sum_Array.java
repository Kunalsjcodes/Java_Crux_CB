package Assignment;

import java.util.Scanner;

public class Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int [] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr2[i]=arr[i];
		}
	    int sum = 0;  
	    int q = sc.nextInt();
	    while(q!=0) {
	    	int x = sc.nextInt();
	    	for (int i=0; i<n; i++) {
	    		if(i-x>=0) {
		    		arr[i]=arr2[i]+arr2[i-x];
		    	}
		    	else {
		    		int x1=i-x;
		    		x1=n-(int)(Math.abs(x1));
		    		arr[i]=arr2[i]+arr2[x1];	    		
		    	}
	    		
	    	}
	    	for(int i=0;i<n;i++)
	    		arr2[i]=arr[i];
	    	q--;
	    }
	    
        for (int in = 0; in < n; in++) {  
           sum = sum + arr[in];  
        }  
        sum = sum % 1000000007; 
        System.out.println(sum);  
	}

}

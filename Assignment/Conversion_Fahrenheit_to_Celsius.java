package Assignment;
import java.util.*;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        
        for(int i=min;i<=max;i+=step){
           int celcius =(int) ((5)*(i-32))/9;
           System.out.println(i+" "+celcius);
            }
	}

}

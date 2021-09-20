package lec01;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int factor=0;
		int i=2;
		while(i<n) {
			if(n%i==0) {
				factor++;
				break;
			}
			i++;
		}
		if(factor==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}

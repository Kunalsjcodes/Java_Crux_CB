package lec01;

public class Sum_of_N_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=0;
		while(n<=50){
		sum=n+sum; //sum+=n
		n++;
		}
		System.out.println(sum);
	}
}

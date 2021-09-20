package lec01;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=28;
		if (age<18) {
			System.out.println("Below 18");
		}
		else if(age>=18 && age<60) {
			System.out.println("Yes");
		}
		else {
			System.out.println("Above 60");
		}
	}

}

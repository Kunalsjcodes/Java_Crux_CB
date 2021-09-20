package lec01;

public class Marking_Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=56;
		
		if(marks>=80) {
			System.out.println("Grade A+");
		}
		else if(marks<80 && marks>=70) {
		System.out.println("Grade A");
		}
		else if(marks<70 && marks>=60) {
		System.out.println("Grade B+");
		}
		else if(marks<60 && marks>=50) {
		System.out.println("Grade B");
		}
		else if(marks<50 && marks>=40) {
		System.out.println("Grade C");
		}
		else if(marks<50 && marks>=40) {
		System.out.println("Grade D");
		}
		else if(marks<40 && marks>=30) {
		System.out.println("Grade E");
		}
		else {
		System.out.println("FAIL");
		}
		
		
	}
		

}

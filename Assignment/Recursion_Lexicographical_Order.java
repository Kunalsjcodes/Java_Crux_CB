package Assignment;
import java.util.*;
public class Recursion_Lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int curr = 0;
		int end = sc. nextInt();
		Counting(curr, end);
	}

	public static void Counting(int curr, int end) {
		if (curr > end) {
			return;
		}

		System.out.print(curr + " ");

		int i = 0;

		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Counting(curr * 10 + i, end);
		}
	}

}

package lec15;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dec(5);
	}

	public static void Dec(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		Dec(n - 1);
		//This is a TAIL-RECURSION (if the recursion is the final line of code)
	}
}

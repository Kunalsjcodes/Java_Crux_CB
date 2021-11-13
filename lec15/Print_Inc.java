package lec15;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inc(5);
	}

	public static void Inc(int n) {
		if (n == 0) {
			return;
		}
		Inc(n - 1);
		System.out.println(n);
		//This is a HEAD-RECURSION (if there is any work after recursion call)
	}

}

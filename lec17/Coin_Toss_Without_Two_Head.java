package lec17;

public class Coin_Toss_Without_Two_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Coin_Toss(n, "");
	}

	private static void Coin_Toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		Coin_Toss(n - 1, ans + "T");
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Coin_Toss(n - 1, ans + "H");
		}
	}
}

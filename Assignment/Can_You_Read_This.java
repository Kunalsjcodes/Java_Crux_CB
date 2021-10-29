package Assignment;
import java.util.*;
public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		String[] ans = new String[s.length()];
		int index = 0, k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0)
				i++;
			if ((s.charAt(i) >= 65 && s.charAt(i) <= 90)) {
				ans[index] = s.substring(k, i);
				k = i;
				index++;
			}
			if (i == s.length() - 1) {
				ans[index] = s.substring(k, i + 1);
				k = i;
				index++;
			}
		}
		for (int i = 0; i < index; i++)
			System.out.println(ans[i]);

	}
}
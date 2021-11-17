package Assignment;
import java.util.*;
public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Compression(str);
	}

	public static void Compression(String str) {
		String s = "";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {

				if (count == 1) {
					s = s + str.charAt(i);
				} else {

					s = s + str.charAt(i) + count;
					count = 1;
				}
			} else {
				count++;
			}

		}
		if (count == 1) {
			s += str.charAt(str.length() - 1);
		} else {
			s = s + str.charAt(str.length() - 1) + count;
		}
		System.out.println(s);
	}

}

package Assignment;

import java.util.*;

public class Replace_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String num = String.valueOf(in.nextLong());

		String change = String.valueOf(in.nextLong());

		if (num.contains("0"))

		{

			replacezero(num, change, "");

		}

		else

		{

			System.out.print("Zero is not present");

		}

	}

	public static void replacezero(String num, String change, String ans)

	{

		if (num.length() == 0)

		{

			System.out.println(ans);

			return;

		}

		if (num.charAt(0) == '0')

		{
			ans = ans + change;

			replacezero(num.substring(1, num.length()), change, ans);

		}

		else

		{

			replacezero(num.substring(1, num.length()), change, ans + num.charAt(0));

		}

	}

}
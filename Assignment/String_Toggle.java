package Assignment;

import java.util.*;

public class String_Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		String str;
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		char a[]=str.toCharArray();
		for(c=0;c<a.length;c++)
			{
				if(a[c]>='A' && a[c]<='Z')
					{
						a[c]=(char)((int)a[c]+32);
					}
				else if(a[c]>='a' && a[c]<='z')
					{
						a[c]=(char)((int)a[c]-32);
					}
			}
		for(c=0;c<a.length;c++)
			System.out.print(a[c]);
	}
}
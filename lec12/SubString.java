package lec12;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Print(str);

//		for(int i=0; i<str.length(); i++) {
//			String s1 = "";
//			for (int j=i; j<str.length(); j++) {
//				s1+=str.charAt(j);
//				System.out.println(s1);
//			}
//			System.out.println();
//		}

	}

	public static void Print(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.subSequence(i, j));
			}
			System.out.println();
		}
	}
}
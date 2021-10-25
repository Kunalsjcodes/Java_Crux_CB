package lec12;

public class String_Demo1 {
	// :- String forms it's address in heap or in String pool
	// :- If any string is created with new keyword then string will be created in heap
	// with different locations.
	// :- If the string is created directly without new keyword then the address will
	// be same for same string.

	// :- String will assign new address if that is created using "concat" , "new" ,
	// "User Input" or "+"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello"; // 2k location //Created in Intern/String pool
		String str1 = "Hello"; // 2k location //Created in Intern/String pool
		String s1 = new String("Hello"); // 3k location //Created in Heap (Not in pool)
		String s2 = new String("Hello"); // 4k location //Created in Heap (Not in pool)
		System.out.println(str);
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}
	}

}

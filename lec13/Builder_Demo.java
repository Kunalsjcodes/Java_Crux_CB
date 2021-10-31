package lec13;

public class Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initially the capacity of builder string is 16.
		// If the length of builder cross the capacity then builder grows its capacity.
		// Builder grows on = (old size*2)+2

		// Builder to String....String s = sb.toString();)
		// String to Builder....String s1 = "Hey"....StringBuilder sb1 = new
		// StringBuilder(s1);

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hellobye");
		sb.append("hellobyehey");
		sb.append("hellobyeheyhellobye");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());
		// Builder to String

		String s = sb.toString();
		// String to Builder
		
		String s1 = "bye";
		StringBuilder sb1 = new StringBuilder(s1);
	}

}

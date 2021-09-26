package lec04;

public class Data_types_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=5;
		short s=10;
		int i=428; // (10^9)10 to the power 9
		long l=2000000000000000l; //(10^18)10 to the power 18 .....if we want to make a long digit then add "l" at last
		
		b=(byte) i;
		System.out.println(i);
		System.out.println(b);
	}

}

package lec32;

public class Client_MinStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Min_Stack ms = new Min_Stack();
		ms.push(5);
		ms.push(7);
		ms.push(2);
		ms.push(9);
		ms.push(4);
		ms.push(3);
		ms.push(8);
		ms.push(1);
		ms.push(17);
		System.out.println(ms.min());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.min());
		System.out.println(ms.peek());

	}

}

package lec27;

public class Client_DyQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(101);
		dq.Enqueue(102);
		dq.Enqueue(103);
		dq.Enqueue(104);
		dq.Enqueue(1033);
		dq.Enqueue(103);
		dq.Enqueue(103);
		dq.display();

	}
}

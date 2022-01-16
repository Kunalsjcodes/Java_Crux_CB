package lec28;

import lec27.Dynamic_Queue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.display();
		Reverse(dq);
		System.out.println("....................");
		dq.display();

	}

	public static void Reverse(Dynamic_Queue dq) throws Exception {
		if (dq.isEmpty()) {
			return;
		}

		int i = dq.dequeue();
		Reverse(dq);
		dq.Enqueue(i);
	}
}
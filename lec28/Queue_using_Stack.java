package lec28;

import lec27.Dynamic_Stack;

public class Queue_using_Stack {

	private Dynamic_Stack primary;

	private Dynamic_Stack helper;

	public Queue_using_Stack() {
		// TODO Auto-generated constructor stub
		this.primary = new Dynamic_Stack();
		this.helper = new Dynamic_Stack();
	}

	public void Enqueue(int item) throws Exception {
		while (!this.primary.isEmpty()) {
			int i = this.primary.pop();
			this.helper.push(i);
		}
		this.primary.push(item);

		while (!this.helper.isEmpty()) {
			int i = this.helper.pop();
			this.primary.push(i);
		}
	}

	public int dequeue() throws Exception {

		return this.primary.pop();

	}

	public int getfornt() throws Exception {
		return this.primary.peek();
	}

	public int size() {
		return this.primary.size();
	}

}
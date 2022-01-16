package lec27;

import lec26.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int item) throws Exception {

		if (this.isfull()) {
			int[] newarra = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				newarra[i] = this.data[i];

			}
			this.data = newarra;

		}

		super.push(item);

	}

}

package lec30;

public class Flood_Cycle_Detection {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}

	}

	public void addLast(int item) {

		if (this.size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void Create_Cycle() {

		this.tail.next = this.head;

	}

	public boolean isCycle() {
		Node Slow = head;
		Node Fast = head;

		while (Fast != null && Fast.next != null) {

			Fast = Fast.next.next;
			Slow = Slow.next;

			if (Slow == Fast) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

		Flood_Cycle_Detection fd = new Flood_Cycle_Detection();
		fd.addLast(10);
		fd.addLast(20);
		fd.addLast(30);
		fd.addLast(40);
		fd.addLast(50);
		fd.Create_Cycle();
		System.out.println(fd.isCycle());

	}

}
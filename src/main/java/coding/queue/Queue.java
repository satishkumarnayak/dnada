package coding.queue;

public class Queue {

	private static class Node {
		int data;
		Node next;

		private Node(int data) {
			this.data = data;
		}
	}

	Node head;
	Node tail;
	int size;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
			return;
		}
		if (tail != null) {
			tail.next = newNode;
			tail = newNode;
			size++;
		}

	}

	public int size() {
		return size;
	}

	public void remove() {
		if(head != null) {
			head = head.next;
			size--;
		}

	}

}

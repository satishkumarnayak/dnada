package coding.stack;

public class Stack {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	private int size;

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public int size() {
		return size;
	}

	public int pop() {
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public int peek() {

		return head.data;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

}

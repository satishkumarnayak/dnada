package coding.linkedlist;

public class LinkedList {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private int size;

	public void addFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}

		newNode.next = head;
		head = newNode;
		size++;

	}

	public int getFirst() {
		if (head != null) {
			return head.data;
		}
		return 0;
	}

	public int getLast() {
		Node currentNode = null;
		if (head != null) {
			if (head.next == null) {
				return head.data;
			}
			currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			return currentNode.data;
		}
		return -1;
	}

	public void addBack(int data) {
		Node newNode = new Node(data);
		Node current = null;
		current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;

	}

	public int size() {
		return size;
	}

	public void clear() {
		if(head != null) {
			head.next = null;
			size = 0;
		}
	}

	public void delete(int data) {
		if(head.next == null) {
			if(head.data == data) {
				head = null;
				size = 0;
			}
		}
		Node current = head;

		while(current.next != null) {
		if(current.next.data == data) {
				current.next = current.next.next;
				size--;
				return;
			}
			current = current.next;
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

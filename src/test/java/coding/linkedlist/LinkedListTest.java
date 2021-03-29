package coding.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	LinkedList ll;

	@Before
	public void setup() {
		ll = new LinkedList();
	}

	@Test
	public void testAddFront() {
		ll.addFront(12);
		ll.addFront(13);
	}

	@Test
	public void testGetFront() {
		ll.addFront(12);
		ll.addFront(13);
		assertEquals(13, ll.getFirst());
	}

	@Test
	public void testGetLast() {
		ll.addFront(12);
		ll.addFront(13);
		assertEquals(12, ll.getLast());
	}

	@Test
	public void testGetLast2() {

		ll.addFront(13);
		assertEquals(13, ll.getLast());
	}
	
	@Test
	public void testAddBack() {
		ll.addFront(12);
		ll.addFront(13);
		ll.addBack(15);
		assertEquals(15, ll.getLast());
	}
	
	@Test
	public void testSize() {
		ll.addFront(12);
		ll.addFront(13);
		assertEquals(2, ll.size());
	}
	
	@Test
	public void testSize2() {
		ll.addFront(12);
		ll.addFront(13);
		ll.addBack(15);
		assertEquals(3, ll.size());
	}
	
	@Test
	public void testClear() {
		ll.addFront(12);
		ll.addFront(13);
		ll.addBack(15);
		ll.clear();
		assertEquals(0, ll.size());
	}
	
	@Test
	public void testDelete() {
		ll.addFront(12);
		ll.addFront(13);
		ll.addBack(15);
		assertEquals(3, ll.size());
		assertEquals(15, ll.getLast());
		ll.delete(15);
		assertEquals(12, ll.getLast());
		assertEquals(2, ll.size());
	}

	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

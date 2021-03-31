package coding.queue;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	Queue queue;

	@Before
	public void setUp() {
		queue = new Queue();
	}

	@Test
	public void addTest() {
		queue.add(10);
		assertEquals(1, queue.size());
		queue.add(20);
		assertEquals(2, queue.size());
	}
	
	@Test
	public void removeTest() {
		queue.add(10);
		queue.add(20);
		assertEquals(2, queue.size());
		queue.remove();
		assertEquals(1, queue.size());
	}

}

package coding.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	Stack stack;

	@Before
	public void setup() {
		stack = new Stack();
	}

	@Test
	public void pushTest() {
		stack.push(10);
		stack.push(8);
		assertEquals(2, stack.size());

	}

	@Test
	public void popTest() {
		stack.push(10);
		stack.push(8);
		assertEquals(2, stack.size());
		assertEquals(8, stack.pop());
		assertEquals(1, stack.size());

	}

	@Test
	public void peekTest() {
		stack.push(8);
		stack.push(10);
		assertEquals(2, stack.size());
		assertEquals(10, stack.peek());
		assertEquals(2, stack.size());
	}
	
	public void isEmpty() {
		stack.push(8);
		stack.push(10);
		assertEquals(false, stack.isEmpty());
	}
}

















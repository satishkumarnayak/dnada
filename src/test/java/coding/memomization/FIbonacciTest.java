package coding.memomization;

import static org.junit.Assert.*;

import org.junit.Test;

public class FIbonacciTest {
	
	FIbonacci fibo = new FIbonacci();
// 0 1 1 2 3 5 8 
//	@Test
	public void test() {
		long startTime = System.currentTimeMillis();
		long result = fibo.fib(45);
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time:"+(int)(((endTime - startTime) / 1000) % 60));
	}
//	@Test
	public void testFibo() {
		long startTime = System.currentTimeMillis();
		long result = fibo.memoFib(6);
		System.out.println(result);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time:"+(int)(((endTime - startTime) / 1000) % 60));
	}
	
	@Test
	public void testPrint() {
		long startTime = System.currentTimeMillis();
		fibo.printFib(6);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time:"+(int)(((endTime - startTime) / 1000) % 60));
	}
}

package coding.memomization;

import java.util.HashMap;
import java.util.Map;

public class FIbonacci {

	// f(0) -> 0

	// f(1) -> 1

	// f(n) -> f(n-1) + f(n-2)

	Map<Long, Long> memo = new HashMap();
	
	public long fib(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);

	}
	
	public long memoFib(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		if(memo.containsKey(n)) {
			return memo.get(n);
		} else {
			long fib = memoFib(n-1) + memoFib(n-2);
			memo.put(n, fib);
			return fib;
		}
	}
	
	public void printFib(long n) {
		
	for(long i = n ; n > 0 ; n--) {
		long result = printFb(n);
		System.out.println("Fib of "+n+":"+result);
	}
		

	}
	
	public long printFb(long n) {
		long result = n;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		else {
			result = printFb(n - 1) + printFb(n - 2);
		}
		
		return result;
	}

}

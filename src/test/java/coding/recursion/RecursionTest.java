package coding.recursion;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {
	
	Recursion recursion = new Recursion();

	@Test
	public void stripLeadingZeros() {
	     Assert.assertEquals("1", recursion.stripLeadingZeros("01"));
	     Assert.assertEquals("11", recursion.stripLeadingZeros("011"));
	     Assert.assertEquals("1", recursion.stripLeadingZeros("001"));
	     Assert.assertEquals("10", recursion.stripLeadingZeros("0010"));
	}

}

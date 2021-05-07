package coding.algo.binarysearchpattern;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SortedArraySearchTest {
  
  SortedArraySearch search;

  @Before
  public void setUp() throws Exception {
    search = new SortedArraySearch();
  }

  @Test
  public void test() {
    int[] input = {12, 14, 20, 33, 55, 87};
    int target = 87;
    assertTrue(search.binarySearch2(input, target));
    assertFalse(search.binarySearch2(input, 9));
  }

}

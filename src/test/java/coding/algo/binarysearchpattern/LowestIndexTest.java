package coding.algo.binarysearchpattern;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LowestIndexTest {

  LowestIndex low;
  @Before
  public void setUp() throws Exception {
    low = new LowestIndex();
  }

  @Test
  public void test() {
  int[] input = {3, 4, 4, 4, 8, 9, 11};
  assertEquals(1, low.lowestIndex(input, 4));
  int[] input2 = {3, 4, 6, 7, 8, 8, 8};
  assertEquals(4, low.lowestIndex(input2, 8));
  int[] input3 = {3, 4, 6, 7, 8, 9, 81};
  assertEquals(4, low.lowestIndex(input3, 8));
  }

}

package coding.algo.adhoc;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FindDuplicateTest {
  
  FindDuplicate demo;

  @Before
  public void setUp() throws Exception {
    
    demo = new FindDuplicate();
  }

  @Test
  public void test() {
    int[] ip = {1, 3, 2, 3};
    assertEquals(3, demo.findDuplicate4(ip));
  }

}

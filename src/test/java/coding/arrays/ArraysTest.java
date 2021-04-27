package coding.arrays;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArraysTest {
  
  Arrays arrays;

  @Before
  public void setUp() throws Exception {
    arrays = new Arrays();
  }

//  @Test
  public void testoneDimensionalArray() {
    arrays.oneDimensionalArray();
  }

  @Test
  public void testtwoDimensionalArray() {
    arrays.twoDimensionalArray();
  }
}

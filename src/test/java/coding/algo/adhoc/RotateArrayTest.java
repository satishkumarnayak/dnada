package coding.algo.adhoc;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {
  
  RotateArray rotate;

  @Before
  public void setUp() throws Exception {
    
    rotate = new RotateArray();
  }

  @Test
  public void test() {
    
//   int[] ip = {2, 5, 8, 4, 3, 6};
 //   int[] op = {6, 2, 5, 8, 4, 3};
  // int shift = 1;
  //  int[] ip = {2, 5, 8};
//    int[] op = {8, 2, 5};
 //   int shift = 1;
 //   int[] ip = {2, 5, 8, 4, 3, 6};
 //   int[] op = {4, 3, 6, 2, 5, 8};
 //  int shift = 3;
   int[] ip = {2, 5, 8, 4, 3, 6};
   int[] op = {5, 8 ,4, 3, 6, 2 };
 int shift = 5;
    System.out.println(Arrays.toString(ip));
    int[] rotateBF = rotate.rotate2(ip, shift);
 //   System.out.println(Arrays.toString(ip));
    System.out.println(Arrays.toString(rotateBF));
    assertArrayEquals(op, rotateBF);
    
  }

}

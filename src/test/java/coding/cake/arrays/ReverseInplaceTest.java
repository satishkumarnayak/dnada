package coding.cake.arrays;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class ReverseInplaceTest {

  ReverseInplace pblm;

  @Before
  public void setUp() throws Exception {
    pblm = new ReverseInplace();
  }

  @Test
  public void testReverse() {

    char[] characters = {'h', 'e', 'l', 'l', 'o'};

    pblm.reverse(characters);
    char[] charactersExcepcted = {'o', 'l', 'l', 'e', 'h'};
    assertArrayEquals(charactersExcepcted, characters);
    
  }
  
  @Test
  public void testReverseTwo() {

    char[] characters = {'h', 'e'};

    pblm.reverse(characters);
    char[] charactersExcepcted = {'e', 'h'};
    assertArrayEquals(charactersExcepcted, characters);
    
  }
  
  @Test
  public void testReverseOne() {

    char[] characters = {'h', };

    pblm.reverse(characters);
    char[] charactersExcepcted = {'h'};
    assertArrayEquals(charactersExcepcted, characters);
    
  }

}

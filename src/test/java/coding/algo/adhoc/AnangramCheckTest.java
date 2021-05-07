package coding.algo.adhoc;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AnangramCheckTest {

  AnangramCheck anagram;


  @Before
  public void setUp() throws Exception {
    anagram = new AnangramCheck();
  }

  @Test
  public void test() {
    String s1 = "abaac";
    String s2 = "acaba";

    assertTrue(anagram.anagram2(s1, s2));

  }

  @Test
  public void test2() {
    String s1 = "abaac";
    String s2 = "acabd";
    assertFalse(anagram.anagram2(s1, s2));

  }

  @Test
  public void test3() {
    String s1 = "a";
    String s2 = "a";
    assertTrue(anagram.anagram2(s1, s2));

  }
  
  @Test
  public void test4() {
    String s1 = "a";
    String s2 = "b";
    assertFalse(anagram.anagram2(s1, s2));

  }
  
}

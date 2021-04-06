package coding;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import coding.tree.BinaryTree;

public class BinaryTreeTest {

  BinaryTree tree;

  @Before
  public void setUp() throws Exception {
    tree = new BinaryTree();
  }

  @Test
  public void insertTest() {
    tree.insert(5, "data1");
    tree.insert(3, "data1113");
    tree.insert(7, "data131s");
    tree.insert(2, "data113");
    tree.insert(4, "data143");
    tree.insert(6, "data167");
    tree.insert(8, "data198");

    assertEquals(true, tree.binarySearch(5));
    assertEquals(false, tree.binarySearch(10));
    assertEquals(true, tree.binarySearch(6));
    
    assertEquals(2, tree.min());
    assertEquals(8, tree.max());
  
  }

}

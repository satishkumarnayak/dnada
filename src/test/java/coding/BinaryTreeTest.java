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

 // @Test
  public void treeTest() {
    tree.insert(5, "data1");
    tree.insert(3, "data1113");
    tree.insert(7, "data131s");
    tree.insert(2, "data113");
    tree.insert(4, "data143");
    tree.insert(6, "data167");
    tree.insert(8, "data198");

    assertEquals(true, tree.binarySearch(5));
    assertEquals(true, tree.binarySearch(6));
    
    assertEquals(2, tree.min());
    assertEquals(8, tree.max());
    
    assertEquals(true, tree.binarySearch(2));
    tree.prettyPrint();


    
   
  
  }
  
 // @Test
  public void treeDelNoChildTest() {
    tree.insert(5, "data1");
    tree.insert(3, "data1113");
    tree.insert(7, "data131s");
    tree.insert(2, "data113");
    tree.insert(4, "data143");
    tree.insert(6, "data167");
    tree.insert(8, "data198");

    tree.prettyPrint();

    tree.delete(2);
    assertEquals(false, tree.binarySearch(2));
    tree.delete(8);
    assertEquals(false, tree.binarySearch(8));
    tree.prettyPrint();

  }
  
 // @Test
  public void treeDelOneChildTest() {
    tree.insert(5, "data1");
    tree.insert(3, "data1113");
    tree.insert(7, "data131s");
    tree.insert(2, "data113");
    tree.insert(4, "data143");
    tree.insert(6, "data167");
    tree.insert(8, "data198");

    tree.prettyPrint();

    tree.delete(2);
    assertEquals(false, tree.binarySearch(2));
    tree.delete(3);
    assertEquals(false, tree.binarySearch(3));
    tree.prettyPrint();

  }
  
 // @Test
  public void treeDelOneChild2Test() {
    tree.insert(5, "data1");
    tree.insert(3, "data1113");
    tree.insert(7, "data131s");
    tree.insert(2, "data113");
    tree.insert(4, "data143");
    tree.insert(6, "data167");
    tree.insert(8, "data198");

    tree.prettyPrint();

    tree.delete(8);
    assertEquals(false, tree.binarySearch(8));
    tree.delete(7);
    assertEquals(false, tree.binarySearch(7));
    tree.prettyPrint();

  }
  
  @Test
  public void treeDelTwoChildTest() {
    tree.insert(5, "data1");
    tree.insert(3, "data1113");
    tree.insert(7, "data131s");
    tree.insert(2, "data113");
    tree.insert(4, "data143");
    tree.insert(6, "data167");
    tree.insert(8, "data198");

    tree.prettyPrint();
    tree.delete(7);
    assertEquals(false, tree.binarySearch(7));
    tree.prettyPrint();

  }

}

package coding.tree;

public class BinaryTree {

  public class Node {
    int key;
    String data;
    Node left;
    Node right;

    public Node(int key, String data) {
      this.key = key;
      this.data = data;
    }
  }

  public Node root;

  public void insert(int key, String value) {

    root = insertItem(root, key, value);

  }

  public Node insertItem(Node node, int key, String value) {

    if (node == null) {
      Node newNode = new Node(key, value);
      node = newNode;
      return node;
    }
    if (key < node.key) {
      node.left = insertItem(node.left, key, value);
    } else if (key > node.key) {
      node.right = insertItem(node.right, key, value);
    }
    return node;
  }

  public boolean binarySearch(int key) {

    Node node = find(root, key);
    if (node == null)
      return false;
    if (node.key == key) {
      return true;
    } else
      return false;
  }

  private Node find(Node node, int key) {

    if (node == null)
      return node;
    else if (node.key == key)
      return node;
    else if (key < node.key) {
      return find(node.left, key);
    } else if (key > node.key) {
      return find(node.right, key);
    }
    return null;
  }

  public int min() {
    if (root == null) {
      return -1;
    }
    Node current = root;
    while (current.left != null) {
      current = current.left;
    }
    return current.key;

  }

  public int max() {
    if (root == null) {
      return -1;
    }
    Node current = root;
    while (current.right != null) {
      current = current.right;
    }
    return current.key;
  }

  public void delete(int key) {

    Node nodeToDel = null;
    nodeToDel = deleteNode(root, key);

  }


  private Node deleteNode(Node node, int key) {
    if (node == null) {
      return null;
    } else if (key < node.key) {
      node.left = deleteNode(node.left, key);
    } else if (key > node.key) {
      node.right = deleteNode(node.right, key);
    } else {
      // case 1 : with no child
      if (node.left == null && node.right == null) {
        node = null;
      }

      // case 2 : with one child
      else if (node.left == null && node.right != null) {
        node = node.right;
        node.right = null;
      } else if (node.right == null && node.left != null) {
        node = node.left;
        node.left = null;
      }
      // case 3 : with two child
      else if (node.left != null && node.right != null) {
          // find max right node(or min of left node)
        Node current = node;  
        while(current != null && current.right != null) {
          current = current.right;
        }        
        // copy find node and max code
        node.key = current.key;
        node.data=current.data;
        
        node.right = deleteNode(node.right,node.key);
      }

    }
    return node;
  }

  public void prettyPrint() {
    // Hard coded print out of binary tree depth = 3

    int rootLeftKey = root.left == null ? 0 : root.left.key;
    int rootRightKey = root.right == null ? 0 : root.right.key;

    int rootLeftLeftKey = 0;
    int rootLeftRightKey = 0;

    if (root.left != null) {
      rootLeftLeftKey = root.left.left == null ? 0 : root.left.left.key;
      rootLeftRightKey = root.left.right == null ? 0 : root.left.right.key;
    }

    int rootRightLeftKey = 0;
    int rootRightRightKey = 0;

    if (root.right != null) {
      rootRightLeftKey = root.right.left == null ? 0 : root.right.left.key;
      rootRightRightKey = root.right.right == null ? 0 : root.right.right.key;
    }

    System.out.println("     " + root.key);
    System.out.println("   /  \\");
    System.out.println("  " + rootLeftKey + "    " + rootRightKey);
    System.out.println(" / \\  / \\");
    System.out.println(rootLeftLeftKey + "  " + rootLeftRightKey + " " + rootRightLeftKey + "   "
        + rootRightRightKey);
  }

}

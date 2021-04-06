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

}

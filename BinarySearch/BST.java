package BinarySearch;

public class BST {

  private Node root;

  public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }

  public BST() {

  }

  public int heigthOfTree(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(int value) {
    insert(value, root);
  }

  public Node insert(int value, Node node) {

    if (node == null) {
      node = new Node(value);
      return node;
    }

    if (value < node.value) {
      node.left = insert(value, node.left);
    }

    if (value > node.value) {
      node.right = insert(value, node.right);
    }

    node.height = Math.max(heigthOfTree(node.left), heigthOfTree(node.right));

    return node;
  }

  public void populate(int nums[]) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void display() {
    display(this.root, "Root Node: ");
  }

  public void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + ":");
    display(node.right, "Rigth child of " + node.value + ":");
  }

  public static void main(String[] args) {
    BST bst = new BST();
    int nums[] = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
    bst.populate(nums);
    bst.display();
  }
}

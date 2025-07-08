package Trees.Binary;

public class BinaryT {

  Node root;

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int index = -1;

    public static Node buildTree(int nodes[]) {
      index++;
      if (nodes[index] == -1) {
        return null;
      }
      Node node = new Node(nodes[index]);
      node.left = buildTree(nodes);
      node.right = buildTree(nodes);

      return node;
    }
  }

  public static void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public static void postOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    inOrder(root.right);
    System.out.print(root.data + " ");
  }

  public static int countNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodeCount = countNodes(root.left);
    int rightNodeCount = countNodes(root.right);
    return leftNodeCount + rightNodeCount + 1;
  }

  public static int heightOfTree(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodeHeight = heightOfTree(root.left);
    int rightNodeHeight = heightOfTree(root.right);

    int heightOfTreeNode = Math.max(leftNodeHeight, rightNodeHeight) + 1;
    return heightOfTreeNode;
  }

  public static int diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

    return Math.max(diam3, Math.max(diam1, diam2));
  }

  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodeSum = sumOfNodes(root.left);
    int rightNodeSum = sumOfNodes(root.right);
    return leftNodeSum + rightNodeSum + root.data;
  }

  static class TreeInfo {
    int height;
    int diameter;

    TreeInfo(int height, int diameter) {
      this.height = height;
      this.diameter = diameter;
    }
  }

  public static TreeInfo diameterTree(Node root) {

    if (root == null) {
      return new TreeInfo(0, 0);
    }
    TreeInfo left = diameterTree(root.left);
    TreeInfo right = diameterTree(root.right);

    int heightOfLeftAndRigth = Math.max(left.height, right.height) + 1;

    int diam1 = left.diameter;
    int diam2 = right.diameter;
    int diam3 = left.height + right.height + 1;

    int diameterTree = Math.max(Math.max(diam1, diam2), diam3);

    TreeInfo treeInfo = new TreeInfo(heightOfLeftAndRigth, diameterTree);
    return treeInfo;
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = BinaryTree.buildTree(nodes);
    // System.out.println(root.data);
    System.out.println("PreOrder Data");
    preOrder(root);

    System.out.println();

    System.out.println("InOrder Data");
    inOrder(root);

    System.out.println();

    System.out.println("PostOrder Data");
    postOrder(root);

    System.out.println();

    int count = countNodes(root);
    System.out.println("Total number of nodes is : " + count);

    int sumOfTreeNode = sumOfNodes(root);
    System.out.println("Sum of nodes is : " + sumOfTreeNode);

    int heigthOfTreeNode = heightOfTree(root);
    System.out.println("The height of the tree is : " + heigthOfTreeNode);

    int diameterOfTree = diameter(root);
    System.out.println("Diameter of the binary tree is : " + diameterOfTree);

    System.out.println("Diameter of the binary tree using approach 2 : " + diameterTree(root).diameter);
  }
}

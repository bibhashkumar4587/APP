class TreeNode {
  int val;
  TreeNode left, right;

  TreeNode(int x) {
    val = x;
    left = null;
    right = null;
  }
}

public class InOrderTraversal {
  public void inOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.val + " ");
    inOrder(root.right);
  }

  public static void main(String[] args) {
    InOrderTraversal traversal = new InOrderTraversal();
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.right = new TreeNode(18);
    System.out.println("InOrder Travelsal of Binary Tree is :");
    traversal.inOrder(root);
  }
}

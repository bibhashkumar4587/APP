
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public class Insert_in_Binary_tree {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
      return new TreeNode(val);
    }
    if (val < root.val) {
      root.left = insertIntoBST(root.left, val);
    } else if (val > root.val) {
      root.right = insertIntoBST(root.right, val);
    }
    return root;
  }

  public void inOrderTraversal(TreeNode root) {
    if (root != null) {
      inOrderTraversal(root.left);
      System.out.print(root.val + " ");
      inOrderTraversal(root.right);
    }
  }

  public static void main(String[] args) {
    Insert_in_Binary_tree bst = new Insert_in_Binary_tree();

    TreeNode root = new TreeNode(10);

    root = bst.insertIntoBST(root, 5);
    root = bst.insertIntoBST(root, 15);
    root = bst.insertIntoBST(root, 3);
    root = bst.insertIntoBST(root, 7);
    root = bst.insertIntoBST(root, 13);
    root = bst.insertIntoBST(root, 18);
    System.out.println("Binary Tree is : ");
    bst.inOrderTraversal(root);
  }
}

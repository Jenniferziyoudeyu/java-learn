package class4_Binary_Tree;


public class tree_Traverse {
    public void preorder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }

}
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        this.value = value;
    }
}

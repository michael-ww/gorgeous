package gorgeous.algorithm;

public class LeetCode236 {
    public TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        if (root == null || p == null || q == null) {
            return root;
        }

        TreeNode<Integer> leftTreeNode = this.lowestCommonAncestor(root.getLeft(), p, q);
        TreeNode<Integer> righTreeNode = this.lowestCommonAncestor(root.getRight(), p, q);

        if (leftTreeNode != null && righTreeNode != null) {
            return root;
        } else {
            return leftTreeNode == null ? righTreeNode : leftTreeNode;
        }
    }
}

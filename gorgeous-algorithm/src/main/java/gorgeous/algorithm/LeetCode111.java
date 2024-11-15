package gorgeous.algorithm;

public class LeetCode111 {
    public int minDepth(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftMinDepth = this.minDepth(root.getLeft());
        int rightMinDepth = this.minDepth(root.getRight());
        return Math.min(leftMinDepth, rightMinDepth) + 1;
    }
}

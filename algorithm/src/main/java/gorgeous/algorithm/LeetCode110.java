package gorgeous.algorithm;

public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        return this.isBalancedTree(root).isBalanced;
    }

    private BalancedInfo isBalancedTree(TreeNode root) {
        if (root == null) {
            return new BalancedInfo(0, true);
        }
        BalancedInfo leftBalancedInfo = this.isBalancedTree(root.left);
        BalancedInfo rightBalancedInfo = this.isBalancedTree(root.right);
        int height = Math.max(leftBalancedInfo.height, rightBalancedInfo.height) + 1;
        boolean isBalanced = leftBalancedInfo.isBalanced && rightBalancedInfo.isBalanced && Math.abs(leftBalancedInfo.height - rightBalancedInfo.height) < 2;
        return new BalancedInfo(height, isBalanced);
    }

    public class BalancedInfo {
        public int height;
        public boolean isBalanced;

        public BalancedInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }
}

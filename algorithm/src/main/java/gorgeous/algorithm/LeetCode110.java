package gorgeous.algorithm;

public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        return this.isBalancedTree(root).isBalanced;
    }

    private BalanceInfo isBalancedTree(TreeNode root) {
        if (root == null) {
            return new BalanceInfo(0, true);
        }
        BalanceInfo leftBalancedInfo = this.isBalancedTree(root.left);
        BalanceInfo rightBalancedInfo = this.isBalancedTree(root.right);
        int height = Math.max(leftBalancedInfo.height, rightBalancedInfo.height) + 1;
        boolean isBalanced = leftBalancedInfo.isBalanced && rightBalancedInfo.isBalanced && Math.abs(leftBalancedInfo.height - rightBalancedInfo.height) < 2;
        return new BalanceInfo(height, isBalanced);
    }

    public class BalanceInfo {

        public int height;
        public boolean isBalanced;

        public BalanceInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }
}

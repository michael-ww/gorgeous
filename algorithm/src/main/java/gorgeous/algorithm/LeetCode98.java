package gorgeous.algorithm;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class LeetCode98 {

    public boolean isValidBST1(TreeNode root) {
        if (root == null) {
            return false;
        }
        return this.inorderTraversal(root, new AtomicInteger(Integer.MIN_VALUE));
    }

    private boolean inorderTraversal(TreeNode root, AtomicInteger previous) {
        if (root == null) {
            return true;
        }
        boolean left = this.inorderTraversal(root.left, previous);
        if (!left) {
            return false;
        }
        if (root.value <= previous.get()) {
            return false;
        } else {
            previous.set(root.value);
        }
        return this.inorderTraversal(root.right, previous);
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        Integer previous = Integer.MIN_VALUE;
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                root = stack.pop();
                if (root.value <= previous) {
                    return false;
                } else {
                    previous = root.value;
                }
                root = root.right;
            } else {
                stack.push(root);
                root = root.left;
            }
        }

        return true;
    }

    public boolean isValidBST3(TreeNode root) {
        if (root == null) {
            return false;
        }
        int previous = Integer.MIN_VALUE;
        TreeNode current = root;
        while (current != null) {
            TreeNode mostRight = current.left;
            if (mostRight == null) {

            } else {
                while (mostRight.left != null && mostRight.left != current) {

                }
            }
        }
        return true;
    }
}

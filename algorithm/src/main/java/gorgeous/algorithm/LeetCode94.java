package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        this.inorderTraversal(root, answer);
        return answer;
    }

    private void inorderTraversal(TreeNode tn, List<Integer> answer) {
        if (tn == null) {
            return;
        }
        this.inorderTraversal(tn.left, answer);
        answer.add(tn.value);
        this.inorderTraversal(tn.right, answer);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root == null) {
                root = stack.pop();
                answer.add(root.value);
                root = root.right;
            } else {
                stack.push(root);
                root = root.left;
            }
        }

        return answer;
    }
}

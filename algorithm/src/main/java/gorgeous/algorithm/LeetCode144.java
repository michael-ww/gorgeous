package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        this.preorderTraversal11(root, answer);
        return answer;
    }

    private void preorderTraversal11(TreeNode tn, List<Integer> answer) {
        if (tn == null) {
            return;
        }
        answer.add(tn.value);
        this.preorderTraversal11(tn.left, answer);
        this.preorderTraversal11(tn.right, answer);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tn = stack.pop();
            answer.add(tn.value);
            if (tn.right != null) {
                stack.push(tn.right);
            }
            if (tn.left != null) {
                stack.push(tn.left);
            }
        }

        return answer;
    }

    public List<Integer> preorderTraversal3(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        TreeNode current = root;
        while (current != null) {
            TreeNode mostRigth = current.left;
            if (mostRigth == null) {
                answer.add(current.value);
            } else {
                while (mostRigth.right != null && mostRigth.right != current) {
                    mostRigth = mostRigth.right;
                }
                if (mostRigth.right == null) {
                    answer.add(current.value);
                    mostRigth.right = current;
                    current = current.left;
                    continue;
                } else {
                    mostRigth.right = null;
                }
            }
            current = current.right;
        }

        return answer;
    }
}

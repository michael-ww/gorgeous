package gorgeous.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode145 {

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        this.postorderTraversal(root, answer);
        return answer;
    }

    private void postorderTraversal(TreeNode tn, List<Integer> answer) {
        if (tn == null) {
            return;
        }
        this.postorderTraversal(tn.left, answer);
        this.postorderTraversal(tn.right, answer);
        answer.add(tn.value);
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode tn = stack1.pop();
            stack2.push(tn);
            if (tn.left != null) {
                stack1.push(tn.left);
            }
            if (tn.right != null) {
                stack1.push(tn.right);
            }
        }

        while (!stack2.isEmpty()) {
            TreeNode tn = stack2.pop();
            answer.add(tn.value);
        }

        return answer;
    }

    public List<Integer> postorderTraversal3(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }

        TreeNode current = root;
        while (current != null) {
            TreeNode mostRight = current.left;
            if (mostRight != null) {
                while (mostRight.right != null && mostRight.right != current) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {
                    mostRight.right = current;
                    current = current.left;
                    continue;
                } else {
                    mostRight.right = null;
                    this.printReversingRightEdge(current.left, answer);
                }
            }
            current = current.right;
        }

        this.printReversingRightEdge(root, answer);
        return answer;
    }

    private void printReversingRightEdge(TreeNode tn, List<Integer> answer) {
        TreeNode tail = this.reverseRightEdge(tn);
        TreeNode current = tail;
        while (current != null) {
            answer.add(current.value);
            current = current.right;
        }
        this.reverseRightEdge(tail);
    }

    private TreeNode reverseRightEdge(TreeNode tn) {
        TreeNode current = tn, next, previous = null;
        while (current != null) {
            next = current.right;
            current.right = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}

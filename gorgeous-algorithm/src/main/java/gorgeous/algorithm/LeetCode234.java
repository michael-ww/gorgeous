package gorgeous.algorithm;

import java.util.Stack;

public class LeetCode234 {

    public boolean isPalindrome1(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) {
            return true;
        }

        Stack<ListNode<Integer>> stack = new Stack<>();
        ListNode<Integer> current = head;
        while (current != null) {
            stack.push(current);
            current = current.getNext();
        }

        current = head;
        while (current != null) {
            if (current != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(ListNode<Integer> head) {
        if (head == null) {
            return false;
        }

        ListNode<Integer> fast = head, slow = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        ListNode<Integer> endNode = Utility.reverse(slow.getNext());
        ListNode<Integer> comparer = endNode;
        fast = head;
        boolean answer = true;
        while (comparer != null) {
            if (comparer.getValue() != fast.getValue()) {
                answer = false;
                break;
            }
            comparer = comparer.getNext();
            fast = fast.getNext();
        }
        slow.setNext(Utility.reverse(endNode));
        return answer;
    }
}

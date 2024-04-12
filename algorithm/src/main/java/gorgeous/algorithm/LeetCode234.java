package gorgeous.algorithm;

import java.util.Stack;

public class LeetCode234 {
    public boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (current != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode endNode = Utility.reverse(slow.next);
        ListNode comparer = endNode;
        fast = head;
        boolean answer = true;
        while (comparer != null) {
            if (comparer.value != fast.value) {
                answer = false;
                break;
            }
            comparer = comparer.next;
            fast = fast.next;
        }
        slow.next = Utility.reverse(endNode);
        return answer;
    }
}

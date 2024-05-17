package gorgeous.algorithm;

import java.util.HashSet;

public class LeetCode141 {

    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (hashSet.contains(current)) {
                return true;
            } else {
                hashSet.add(current);
            }
            current = current.next;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head, slow = head;
        while (fast != null && slow != null) {
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}

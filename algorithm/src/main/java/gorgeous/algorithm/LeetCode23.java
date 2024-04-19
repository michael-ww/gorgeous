package gorgeous.algorithm;

import java.util.PriorityQueue;

public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length <= 0) {
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                pq.offer(listNode);
                listNode = listNode.next;
            }
        }

        ListNode previous = new ListNode(0);
        ListNode current = previous;
        while (!pq.isEmpty()) {
            current.next = pq.poll();
            current = current.next;
        }

        return previous.next;
    }
}

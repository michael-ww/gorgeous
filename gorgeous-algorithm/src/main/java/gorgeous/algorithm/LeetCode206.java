package gorgeous.algorithm;

public class LeetCode206 {

    public ListNode<Integer> reverseList(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode<Integer> previous = null, current = head, next;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }
}

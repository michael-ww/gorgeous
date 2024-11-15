package gorgeous.algorithm;

public class LeetCode92 {

    public ListNode<Integer> reverseBetween(ListNode<Integer> head, int left, int right) {
        if (head == null) {
            throw new NullPointerException();
        }
        if (left <= 0 || right <= 0 || left > right) {
            throw new IllegalArgumentException();
        }

        ListNode<Integer> dummy = new ListNode<>(0);
        dummy.setNext(head);
        ListNode<Integer> previous = dummy;
        for (int i = 0; i < left - 1; i++) {
            previous = previous.getNext();
        }

        ListNode<Integer> current = previous, next;
        for (int i = 0; i < right - left; i++) {
            next = current.getNext();
            current.setNext(next.getNext());
            next.setNext(previous.getNext());
            previous.setNext(next);
        }

        return dummy.getNext();
    }
}

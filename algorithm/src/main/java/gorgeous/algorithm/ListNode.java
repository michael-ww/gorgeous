package gorgeous.algorithm;

public class ListNode implements Comparable<ListNode> {

    public int value;

    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public int compareTo(ListNode o) {
        return Integer.compare(this.value, o.value);
    }

}

package mnj;

public class LinkedListTest {
    public static void main(String[] args) {

    }

    public static class Node {
        public Integer value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static class BidirectionalNode {
        public Integer value;
        public BidirectionalNode next;
        public BidirectionalNode previous;
    }

    private static Node reverseLinkedList(Node head) {
        Node previous = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }

    private static BidirectionalNode reverseBidirectionalNode(BidirectionalNode head) {
        BidirectionalNode next = null;
        BidirectionalNode previous = null;
        while (head != null) {
            next = head.next;
            head.previous = previous;
            head.next = next;
            previous = head;
            head = next;
        }
        return previous;
    }
}
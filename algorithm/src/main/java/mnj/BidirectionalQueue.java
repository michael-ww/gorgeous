package mnj;

public class BidirectionalQueue<V> {
    private static class Node<V> {
        public Node<V> previous;
        public Node<V> next;
        public V value;

        public Node(V value) {
            this.previous = null;
            this.next = null;
            this.value = value;
        }
    }

    private Node<V> head;
    private Node<V> tail;
    private Integer size;

    public BidirectionalQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Integer getSize() {
        return this.size;
    }

    public void pushHead(V value) {
        Node<V> current = new Node<V>(value);
        if (this.head == null) {
            this.head = current;
            this.tail = current;
        } else {
            current.next = this.head;
            this.head.previous = current;
            this.head = current;
        }
        this.size++;
    }

    public void pushTail(V value) {
        Node<V> current = new Node<V>(value);
        if (this.tail == null) {
            this.head = current;
            this.tail = current;
        } else {
            current.previous = this.tail;
            this.tail.next = current;
            this.tail = current;
        }
        this.size++;
    }

    public V popHead() {
        if (this.head == null) {
            return null;
        } else {
            V value = this.head.value;
            this.head = this.head.next;
            this.head.previous = null;
            this.size--;
            if (this.size == 0) {
                this.head = this.tail = null;
            }
            return value;
        }
    }

    public V popTail() {
        if (this.tail == null) {
            return null;
        } else {
            V value = this.tail.value;
            this.tail = this.tail.previous;
            this.tail.next = null;
            this.size--;
            if (this.size == 0) {
                this.tail = this.head = null;
            }
            return value;
        }
    }

    public V peekHead() {
        if (this.head == null) {
            return null;
        }
        return this.head.value;
    }

    public V peekTail() {
        if (this.tail == null) {
            return null;
        }
        return this.tail.value;
    }
}

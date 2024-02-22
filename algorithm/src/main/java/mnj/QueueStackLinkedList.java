package mnj;

public class QueueStackLinkedList {
    public static class Node<V> {
        public V value;
        public Node<V> next;

        public Node(V v) {
            this.value = v;
            this.next = null;
        }
    }

    public static class Queue<V> {
        private Node<V> head;
        private Node<V> tail;
        private Integer size;

        public Queue() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public Integer getSize() {
            return this.size;
        }

        public void Enqueue(V value) {
            Node<V> current = new Node<V>(value);
            if (this.tail == null) {
                this.head = current;
                this.tail = current;
            } else {
                this.tail.next = current;
                this.tail = current;
            }
            this.size++;
        }

        public V Dequeue() {
            if (this.head == null) {
                return null;
            } else {
                V value = this.head.value;
                this.head = this.head.next;
                this.size--;
                if (this.size == 0) {
                    this.head = this.tail = null;
                }
                return value;
            }
        }

        public V peek() {
            if (this.head == null) {
                return null;
            } else {
                return this.head.value;
            }
        }
    }

    public static class Stack<V> {
        public Node<V> head;
        public Integer size;

        public Stack() {
            this.head = null;
            this.size = 0;
        }

        public void push(V value) {
            Node<V> current = new Node<V>(value);
            if (this.head == null) {
                this.head = current;
            } else {
                current.next = this.head;
                this.head = current;
            }
            this.size++;
        }

        public V pop() {
            if (this.head == null) {
                return null;
            } else {
                V value = this.head.value;
                this.head = this.head.next;
                this.size--;
                return value;
            }
        }
    }
}

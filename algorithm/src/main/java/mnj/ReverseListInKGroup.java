package mnj;

public class ReverseListInKGroup {
    public static void main(String[] args) {

    }

    private class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public class ReverseKGroup<T> {
        private Node<T> getKGroupEnd(Node<T> start, Integer k) {
            while (k > 0 && start != null) {
                start = start.next;
                k--;
            }
            return start;
        }

        public void reverse(Node<T> start, Node<T> end) {
            
        }
    }
}
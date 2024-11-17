package gorgeous.algorithm;

public class AVL<K extends Comparable<K>, V> {

    private TreapNode<K, V> root;

    public void add(K key, V value) {
        this.root = this.add(root, key, value);
    }

    private TreapNode<K, V> add(TreapNode<K, V> node, K key, V value) {
        if (node == null) {
            node = new TreapNode<>(key, value);
        } else {
            if (node.getKey().compareTo(key) > 0) {
                node.setLeft(this.add(node.getLeft(), key, value));
            } else if (node.getKey().compareTo(key) < 0) {
                node.setRight(this.add(node.getRight(), key, value));
            } else {
                node.setValue(value);
            }
        }
        this.update(node);
        return this.maintain(node);
    }

    private void update(TreapNode<K, V> node) {
        node.setSize((node.getLeft() == null ? 0 : node.getLeft().getSize())
                + (node.getRight() == null ? 0 : node.getRight().getSize()) + 1);
        node.setHeight(Math.max(node.getLeft() == null ? 0 : node.getLeft().getHeight(),
                node.getRight() == null ? 0 : node.getRight().getHeight()) + 1);
    }

    private TreapNode<K, V> maintain(TreapNode<K, V> node) {
        if (node.getLeft().getHeight() - node.getRight().getHeight() > 1) {
            if (node.getLeft().getLeft().getHeight() >= node.getLeft().getRight().getHeight()) {
                node = this.rightRotate(node);
            } else {
                node.setLeft(this.leftRotate(node.getLeft()));
                node = this.rightRotate(node);
            }
        } else if (node.getRight().getHeight() - node.getLeft().getHeight() > 1) {
            if (node.getRight().getRight().getHeight() >= node.getRight().getLeft().getHeight()) {
                node = this.leftRotate(node);
            } else {
                node.setRight(this.rightRotate(node.getRight()));
                node = this.leftRotate(node);
            }
        }
        return node;
    }

    private TreapNode<K, V> leftRotate(TreapNode<K, V> node) {
        TreapNode<K, V> right = node.getRight();
        node.setRight(right.getLeft());
        right.setLeft(node);
        this.update(node);
        this.update(right);
        return right;
    }

    private TreapNode<K, V> rightRotate(TreapNode<K, V> node) {
        TreapNode<K, V> left = node.getLeft();
        node.setLeft(left.getRight());
        left.setRight(node);
        this.update(node);
        this.update(left);
        return left;
    }
}

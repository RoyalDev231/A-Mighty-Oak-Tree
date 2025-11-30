package org.example;

public class Node {

    private Squirrel data;
    private Node left;
    private Node right;

    public Node(Squirrel data) {
        this.data = data;
    }

    // Get the Squirrel stored in this node
    public Squirrel getData() {
        return data;
    }

    // Attach children
    public void set_left(Node left) {
        this.left = left;
    }

    public void set_right(Node right) {
        this.right = right;
    }

    // Traverse: move to left / right child
    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }

    // Convenience method (not required, but useful)
    public boolean isLeaf() {
        return left == null && right == null;
    }
}

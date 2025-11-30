package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    @Test
    public void attachLeftAndRightChildren() {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node root = new Node(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node leftChild = new Node(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node rightChild = new Node(fluffybutt);

        root.set_left(leftChild);
        root.set_right(rightChild);

        assertSame(leftChild, root.left(), "Left child should match");
        assertSame(rightChild, root.right(), "Right child should match");

        assertEquals("Cheeks", root.getData().getName());
        assertEquals("Squeaks", root.left().getData().getName());
        assertEquals("Mr. Fluffy Butt", root.right().getData().getName());
    }

    @Test
    public void leafDetectionWorks() {
        Squirrel solo = new Squirrel("Solo");
        Node node = new Node(solo);

        assertTrue(node.isLeaf(), "New node with no children should be a leaf");

        node.set_left(new Node(new Squirrel("Child")));
        assertFalse(node.isLeaf(), "Node with a child is no longer a leaf");
    }
}

// Node class representing each node of the tree
class Node {


}

// SelfImplementedBinaryTree2 class with basic tree operations
public class SelfImplementedBinaryTree2 {
    // Root of the Binary Tree
    Node root;

    // Constructor
    public SelfImplementedBinaryTree2() {
        root = null;
    }

    // Method to insert a node in the binary tree
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive method to insert a new node
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Pre-order traversal of the tree
    public void preOrderTraversal() {
        preOrderRec(root);
    }

    // Recursive method for pre-order traversal
    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order traversal of the tree
    public void postOrderTraversal() {

    }

    // Recursive method for post-order traversal
    private void postOrderRec(Node root) {


    }

    // In-order traversal of the tree
    public void inOrderTraversal() {

    }

    // Recursive method for in-order traversal
    private void inOrderRec(Node root) {

    }

    // Main method to test the SelfImplementedBinaryTree2 class
    public static void main(String[] args) {
        SelfImplementedBinaryTree2 tree = new SelfImplementedBinaryTree2();

        // Insert nodes to produce the desired pre-order traversal
        int[] values = {25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90};
        for (int value : values) {
            tree.insert(value);
        }

        // Print pre-order traversal
        System.out.println("\nPre-order traversal of the binary tree:");
        tree.preOrderTraversal();

        // Print post-order traversal
        System.out.println("\nPost-order traversal of the binary tree:");
        tree.postOrderTraversal();

        // Print in-order traversal
        System.out.println("\nIn-order traversal of the binary tree:");
        tree.inOrderTraversal();

    }
}

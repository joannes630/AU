// Node class representing each node of the tree
class Node {
    int value;
    Node left, right;

    // Constructor
    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// BinaryTree class with basic tree operations
public class SelfImplementedBinaryTree {
    // Root of the Binary Tree
    Node root;

    // Constructor
    public SelfImplementedBinaryTree() {
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

    // In-order traversal of the tree
    public void inOrderTraversal() {
        inOrderRec(root);
    }

    // Recursive method for in-order traversal
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    // Main method to test the SelfImplementedBinaryTree class
    public static void main(String[] args) {
        SelfImplementedBinaryTree tree = new SelfImplementedBinaryTree();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderTraversal();
    }
}

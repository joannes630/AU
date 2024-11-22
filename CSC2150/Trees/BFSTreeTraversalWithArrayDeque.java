import java.util.*;

// Define the TreeNode class
class TreeNode {
    int value;
    TreeNode left, right;

    // Constructor
    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class BFSTreeTraversalWithArrayDeque {

    // Perform Breadth-First Search using a Deque (ArrayDeque)
    public static void bfs(TreeNode root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }

        Deque<TreeNode> deque = new ArrayDeque<>(); // Using ArrayDeque
        deque.addLast(root); // Add root to the deque

        System.out.print("BFS Traversal: ");
        while (!deque.isEmpty()) {
            TreeNode currentNode = deque.pollFirst(); // Remove from the front
            System.out.print(currentNode.value + " ");

            // Add left child to the deque
            if (currentNode.left != null) {
                deque.addLast(currentNode.left);
            }

            // Add right child to the deque
            if (currentNode.right != null) {
                deque.addLast(currentNode.right);
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Create a sample tree:
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform BFS on the tree
        bfs(root);
    }
}

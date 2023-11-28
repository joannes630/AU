package com.example.chapter21trees;

/**
   This program demonstrates construction and traversal of binary trees.
 */   
   
public class BinaryTreeNodesDemo
{  
    // Creates a binary tree from nodes and traverses it in 
    // in inorder.
    public static void main(String[] args)
    {
        Node root = null;  // Will be root of the binary tree.
        
//        Node aNode = new Node(10);
//        aNode.left = new Node(20);
//        Node dNode = new Node(40);
//        Node cNode = new Node(30, dNode, new Node(50));
//        aNode.right = cNode;
//        root = aNode;

        Node a = new Node(25);
        Node b = new Node(15);
        Node c = new Node(50);
        a.left = b;
        a.right = c;
        Node d = new Node(10, new Node(4), new Node(12));
        Node e = new Node(22, new Node(18), new Node(24));
        b.left = d;
        b.right = e;
        Node f = new Node(35, new Node(31), new Node(44));
        Node g = new Node(70, new Node(66), new Node(90));
        c.left = f;
        c.right = g;
        root = a;

        System.out.print("Inorder traversal is: ");
        NodeUtilities.inorder(root);
        System.out.println();

        System.out.print("Preorder traversal is: ");
        NodeUtilities.preorder(root);
        System.out.println();

        System.out.print("Postorder traversal is: ");
        NodeUtilities.postorder(root);
        System.out.println();

    }
}
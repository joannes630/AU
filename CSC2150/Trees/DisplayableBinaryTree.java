package com.example.chapter21trees;

import javax.swing.*;
import java.awt.*;

/**
   This program demonstrates the graphical
   display of binary trees.
 */

public class DisplayableBinaryTree
{
    private class Node
    {
        char value;          // Value stored in node
        Node left, right;    // Left and right child      
        
        /**
           Constructor for leaf nodes.
           @param val The value to initialize the node.
        */
        
        Node(char val)
        {
            value = val;
            left = null;
            right = null;
        }   
        
        /** 
           Constructor for non-leaf nodes.
           @param val The value to initialize the node.
           @param leftChild The link to the left child.
           @param rightChild The link to the right child.
        */

        Node(char val, Node leftChild, Node rightChild)
        {
            value = val;
            left = leftChild;
            right = rightChild;
        }
    }
    
    /**
       The BTreeDisplay class graphically displays
		 trees in a JPanel. The JPanel is recursively
		 partitioned into a top part dislaying the root,
		 and two lowerparts displaying the left and 
		 right subtrees.
    */
    
    private class BTreeDisplay extends JPanel
    {
        /**
           Constructor.
           @param tree The root of the binary 
			  tree to display.
         */
        
        BTreeDisplay(Node tree)
        {           
           setBorder(BorderFactory.createEtchedBorder());
           setLayout(new BorderLayout());
           if (tree != null) 
           {          
               String value = String.valueOf(tree.value);  
               int pos = SwingConstants.CENTER;
               JLabel rootLabel = new JLabel(value, pos);                         
               add(rootLabel, BorderLayout.NORTH);
               JPanel panel = new JPanel(new GridLayout(1, 2));
               panel.add(new BTreeDisplay(tree.left));
               panel.add(new BTreeDisplay(tree.right));    
               add(panel);
           }       
        }   
    }
   
    private Node root;          // Root of binary tree
    
    /**
       Constructor.
    */
    
    public DisplayableBinaryTree()
    {
        Node aNode = new Node('A');  
        aNode.left = new Node('B');
        Node dNode = new Node('D');
        Node cNode = new Node('C', dNode, null);
        aNode.right = cNode;
        root = aNode;       
    }
    
    /**
       The getView method creates and returns a 
       a graphical view of the binary tree.
       @return A panel that displays a view of the tree.
    */
    
    public JPanel getView()
    {
       return new BTreeDisplay(root);       
    }

    /**
       The main method simply creates a Displayable
       Binary tree and displays it.
    */

    public static void main(String [ ] args)
    {
       DisplayableBinaryTree binTree
		      = new DisplayableBinaryTree();
	    String title = "Graphical Display of Binary Tree";		
       JFrame bFrame = new JFrame(title);                  
       bFrame.add(binTree.getView());
       bFrame.pack();
       bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       bFrame.setVisible(true);
    }
}
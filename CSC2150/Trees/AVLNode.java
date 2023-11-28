package com.example.chapter21trees;

/**
   AVLNode extends Node from which it inherits
   the value field, and also the left and right links.
 */

class AVLNode extends Node
{   
    int height;  

    // These methods cast the inhertied NODE links
    // AVLNode links.
    AVLNode getLeft(){ return (AVLNode) left; }
    AVLNode getRight(){ return (AVLNode) right; }

    public AVLNode(int value)
    {
        // Call the other (sister) constructor.
        this(value, null, null);
    }

    public AVLNode(int val, AVLNode left1, AVLNode right1)
    {  
        // Pass the parameters to the superclass constructor.
        super(val, left1, right1);
        height = 0;
    }

    /**
       The resetHeight methods recomputes height if the 
       left or right subtrees have changed.
     */
    void resetHeight()
    {
        int leftHeight = -1;
        int rightHeight = -1;
        if (left != null)
        {
            leftHeight = getLeft().height;
        }
        if (right != null)
        {
            rightHeight = getRight().height;
        }
        height = 1 + Math.max(leftHeight, rightHeight);
    }
}

package com.example.chapter21trees;

/**
   This class has various utility methods for working with nodes.
*/
public class NodeUtilities
{    
    /**
       Inorder traversal of a binary tree rooted at a node.
       @param btree : The root of the binary tree.
     */
    static public void inorder(Node btree)
    {
        if (btree != null)
        {
            inorder(btree.left);
            System.out.print(btree.value + " ");
            inorder(btree.right);
        }
    }

    /**
     Preorder traversal of a binary tree rooted at a node.
     <Root><Left><Right>
     @param btree : The root of the binary tree.
     */
    static public void preorder(Node btree)
    {
        if (btree != null)
        {
            System.out.print(btree.value + " ");
            preorder(btree.left);
            preorder(btree.right);
        }
    }

    /**
     PostOrder traversal of a binary tree rooted at a node.
     <Left><Right><Root>
     @param btree : The root of the binary tree.
     */
    static public void postorder(Node btree)
    {
        if (btree != null)
        {
            postorder(btree.left);
            postorder(btree.right);
            System.out.print(btree.value + " ");
        }
    }
}
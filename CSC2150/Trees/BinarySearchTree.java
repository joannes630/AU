package com.example.chapter21trees;

/**
   This class implements a binary search tree.
 */

public class BinarySearchTree extends BinaryTree
{
    /**
       This class represents the result of removing 
       a node from a binary tree.
     */
    private class RemovalResult
    {
        Node node;    // Removed node
        Node tree;    // Remaining tree

        RemovalResult(Node node, Node tree)
        {
            this.node = node;
            this.tree = tree;
        }
    }

    /**
       The public add method adds a value to the tree by 
       calling a private add method and passing it the 
       root of the tree.     
       @param x The value to add to the tree.
       @return true.
     */
    public boolean add(int x)
    {
        root = add(x, root);
        return true;
    }

    /**
       The contains method checks to see if a value is 
       in the binary tree.     
       @param x The value to check for.
       @return true if x is in the tree, false otherwise.
     */
    public boolean contains(int x)
    {
        // Call the private recursive method.
        return contains(x, root);
    }
   
    /**
       The add method adds a value to the search tree.     
       @x the value to add.
       @param bstree The root of the binary search tree.
       @return The root of the resulting binary search tree.
     */
    private Node add(int x, Node bstree)
    {
        if (bstree == null)
        {
            return new Node(x);
        }
        // bstree is not null. 
        if (x < bstree.value)
        {
            // Add x to the left subtree and replace 
            // the current left subtree with the result.
            bstree.left = add(x, bstree.left);
        } else
        {
            // Add x to the right subtree.
            bstree.right = add(x, bstree.right);
        }
        return bstree;
    }

    /**
       The method contains checks whether an item is in 
       a binary search tree.     
       @param x The item to check for.
       @param bstree The binary tree to look in.
       @return true if found, false otherwise.
     */
    private boolean contains(int x, Node bstree)
    {
        if (bstree == null)
        {
            return false;
        }
        if (x == bstree.value)
        {
            return true;
        }
        if (x < bstree.value)
        {
            // Recursively look in left subtree.
            return contains(x, bstree.left);
        } else
        {
            // Recursively look in right subtree.
            return contains(x, bstree.right);
        }
    }

    /**
       The remove method removes a value from the 
       binary search tree.     
       @param x The value to remove.
       @returns true if x was removed, false if x not found.
     */
    public boolean remove(int x)
    {
        RemovalResult result = remove(root, x);
        if (result == null)
        {
            return false;
        } else
        {
            root = result.tree;
            return true;
        }
    }

    /**
       This remove method removes a value a from a 
       binary search tree and returns the removed node 
       and the remaining tree wrapped in a RemovalResult object.
      
       @param bTree The binary search tree.
       @param x The value to be removed.
       @return null if x is not found in bTree.
     */
    private RemovalResult remove(Node bTree, int x)
    {
        if (bTree == null)
        {
            return null;
        }
        if (x < bTree.value)
        {
            // Remove x from the left subtree.
            RemovalResult result = remove(bTree.left, x);
            if (result == null)
            {
                return null;
            }
            bTree.left = result.tree;
            result.tree = bTree;
            return result;
        }
        if (x > bTree.value)
        {
            // Remove x from the right subtree.
            RemovalResult result = remove(bTree.right, x);
            if (result == null)
            {
                return null;
            }
            bTree.right = result.tree;
            result.tree = bTree;
            return result;
        }
        // x is in this root node.      
        // Is it a leaf? 
        if (bTree.right == null && bTree.left == null)
        {
            return new RemovalResult(bTree, null);
        }

        // Does the node have two children?
        if (bTree.right != null && bTree.left != null)
        {
            // Remove largest node in left subtree and 
            // make it the root of the remaining tree.
            RemovalResult remResult = removeLargest(bTree.left);
            Node newRoot = remResult.node;
            newRoot.left = remResult.tree;
            newRoot.right = bTree.right;

            // Prepare the result to be returned.
            bTree.left = null;
            bTree.right = null;
            return new RemovalResult(bTree, newRoot);
        }
        // The node has one child
        Node node = bTree;
        Node tree;
        if (bTree.left != null)
        {
            tree = bTree.left;
        } else
        {
            tree = bTree.right;
        }
        node.left = null;
        node.right = null;
        return new RemovalResult(node, tree);
    }

    /**
       The removeLargest method removes the largest node
       from a binary search tree.
       @param bTree: The binary search tree.
       @return The result of removing the largest node.
     */
    private RemovalResult removeLargest(Node bTree)
    {
        if (bTree == null)
        {
            return null;
        }
        if (bTree.right == null)
        {
            // Root is the largest node
            Node tree = bTree.left;
            bTree.left = null;
            return new RemovalResult(bTree, tree);
        } else
        {
            // Remove the largest node from the right subtree.
            RemovalResult remResult
                    = removeLargest(bTree.right);
            bTree.right = remResult.tree;
            remResult.tree = bTree;
            return remResult;
        }
    }
}

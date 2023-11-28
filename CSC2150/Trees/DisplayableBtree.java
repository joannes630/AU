package com.example.chapter21trees;

import javafx.scene.layout.Pane;

public class DisplayableBtree extends BinaryTree
{
    private final BinaryTree tree;
    public DisplayableBtree(BinaryTree t)
    {
        tree = t;        
    }
    
    @Override
    public boolean isEmpty()
    {
       return tree.isEmpty();
    }    

    // Return a view of the binary tree suitable for 
    // display
    public Pane getView()
    {       
       return  GUINodeUtilities.getView(tree.root);
    }
}

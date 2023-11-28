package com.example.chapter21trees;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
   This class has a utility method for the 
   graphical display of a binary tree.
*/

class GUINodeUtilities
{
    public static Pane getView(Node root)
    {
        // Empty tree is displayed as an empty  HBox
        if (root == null) { return new HBox(); }
        
        // Leaf node displayed as a single un-editabel text field
        // in a HBox.
        if (root.left == null && root.right == null)
        {
            TextField tF = new TextField(String.valueOf(root.value));
            tF.setPrefColumnCount(2);
            tF.setEditable(false);
            HBox hBox = new HBox();
            hBox.setAlignment(Pos.CENTER);
            hBox.getChildren().add(tF);
            hBox.setPadding(new Insets(5));
            return hBox;
        }
        // Non-leaf node uses a BorderPane
        // that puts the value in the TOP region, and left and right 
        // subtrees in the LEFT and RIGHT regions.      
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-border-color: gray");
        pane.setPadding(new Insets(10));
        
        // Value of a non-leaf node is displayed in a text field
        // in a HBox in the TOP region of the BorderPane.
        String value = String.valueOf(root.value);
        TextField tF2 = new TextField(value);
        tF2.setPrefColumnCount(2);
        tF2.setEditable(false);
        HBox valueHBox = new HBox();
        valueHBox.setAlignment(Pos.CENTER);
        valueHBox.getChildren().add(tF2);
        valueHBox.setPadding(new Insets(5));
        pane.setTop(valueHBox);
        
        // Left and right subtrees are recursively displayed
        // in the LEFT and RIGHT region of the BorderPane.
        pane.setLeft(getView(root.left));
        pane.setCenter(new Label("         "));  // For spacing.
        pane.setRight(getView(root.right));

        return pane;
    }
}

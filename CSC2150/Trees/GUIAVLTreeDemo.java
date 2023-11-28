package com.example.chapter21trees;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
   This class is a JavaFX interface for testing the
   the binary search tree class.
*/

public class GUIAVLTreeDemo extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
       // Set up the binary tree to manipulate        
      
       AVLTree avlTree = new AVLTree(); 
    
       // This binary tree wraps the real binary tree 
       // so it can be displayed.
       DisplayableBtree 
           displayBinTree = new DisplayableBtree(avlTree);
        
       // Displays the result of the user command.
       TextField cmdResultTextField = new TextField();
       cmdResultTextField.setEditable(false);
       
       // Used by the user to enter a command.
       TextField cmdTextField = new TextField();
       
       // HBox1 holds cmdResultTextField and its label.
       HBox hBox1 = new HBox(10);
       Label cmdResultLabel = new Label("Command Result");
       hBox1.getChildren().addAll(cmdResultLabel, cmdResultTextField);
       
       // Place holder for the binary tree view.
       HBox bTreeView = new HBox();
       bTreeView.setAlignment(Pos.CENTER);
       
       // HBox2 holds the cmdTextField and its label
       HBox hBox2 = new HBox(10);
       Label cmdLabel = new Label("Command [add]");
       hBox2.getChildren().addAll(cmdLabel, cmdTextField);
       
       // Put the three HBox objects in a VBox
       VBox outerPane = new VBox(10);
       outerPane.setPadding(new Insets(10));
       outerPane.getChildren().addAll(hBox1, bTreeView, hBox2);
       
       // Command hander needs to access to the bTreeView
       // so it can set the binary tree view, and to the 
       // cmdResultTextField so it can set the command result.
       // Also needs access to the binary tree and its displayable
       // twin.
       EventHandler<ActionEvent> 
           handler = new CmdHandler2(bTreeView, cmdResultTextField,
                                    avlTree, displayBinTree);      
       cmdTextField.setOnAction(handler);
       
       // Set up the stage
       stage.setTitle("Binary Search Tree Operations");
       stage.setScene(new Scene(outerPane));
       stage.show();       
    }
    
    public static void main(String [] args)
    {
         launch(args) ;      
    }
    
}

// Event Handler class
class CmdHandler2 implements EventHandler<ActionEvent>
{
    // These class variables reference
    // data in the calling environment.
    private HBox view;
    private TextField cmdResultTextField;
    private AVLTree binTree;
    private DisplayableBtree displayBinTree;
    
    // Constructor stores references to data in 
    // the calling enviroment.
    public CmdHandler2(HBox tView, TextField cmdResTf,
                      AVLTree tree, 
                      DisplayableBtree dTree)
    {
        view = tView;
        cmdResultTextField = cmdResTf;
        binTree = tree;
        displayBinTree = dTree;
    }
    
    public void handle(ActionEvent evt)
    {
        // Get the command from the event target.
        TextField cmdTf = (TextField)evt.getTarget();
        String cmdStr =  cmdTf.getText();
        
        // Use a scanner to read the command and its parts.
        Scanner sc = new Scanner(cmdStr);
        String cmd = sc.next();
        switch (cmd)
        {
            case "add":
            {
                // Perform the operation on the tree.
                int value = sc.nextInt();
                binTree.add(value);
               
                // Replace the old view of the tree.
                view.getChildren().clear();             
                view.getChildren().add(displayBinTree.getView());         
                cmdResultTextField.setText(" ");
            }
            return;           
        }
    }
}

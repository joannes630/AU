package com.example.chapter21trees;

import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.layout.VBox;
 import javafx.stage.Stage;
 
 /**
    This program demonstrates the GUI display of a 
    binary tree.
 */
 
 public class GUIBtreeDisplayDemo extends Application
 {
     public static void main(String [] args)
     {
        launch();
     }
     
     @Override
     public void start(Stage stage) throws Exception
     {        
         // Create the tree.
         Node root;
//         Node aNode = new Node(10);
//         aNode.left = new Node(20);
//         Node dNode = new Node(40);
//         Node cNode = new Node(30, dNode, new Node(50));
//         aNode.right = cNode;
//         root = aNode;

         Node a = new Node(25);
         Node b = new Node(15);
         Node c = new Node(50);
         Node d = new Node(10, new Node(4), new Node(12));
         Node e = new Node(22, new Node(18), new Node(24));
         Node f = new Node(35, new Node(31), new Node(44));
         Node g = new Node(70, new Node(66), new Node(90));
         a.left = b;
         a.right = c;
         b.left = d;
         b.right = e;
         c.left = f;
         c.right = g;
         root = a;

         // Display the binary tree in a scene on the stage.
         VBox vBox = new VBox(GUINodeUtilities.getView(root));
         vBox.setPadding(new Insets(10));
         Scene scene = new Scene(vBox);
         stage.setScene(scene);
         stage.setTitle("Display of Binary Tree");
         stage.show();

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

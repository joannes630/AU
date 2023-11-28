package com.example.chapter21trees;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

/**
 * This program demonstrates use of 
 * the TreeView component 
 */

public class TreeViewProg extends Application
{    
    @Override
    public void start(Stage primaryStage)
    {
        // Create root node
        TreeItem<String> root = new TreeItem<>("Gregorio and Adelaida");
        root.setExpanded(true);

        // Create three nodes to be children of the root
        TreeItem<String> genie =  new TreeItem<>("Genie and Linda");
        TreeItem<String> romeo =  new TreeItem<>("Romeo and Cely");
        TreeItem<String> felicidad =  new TreeItem<>("Felicidad and Edgardo");
        root.getChildren().addAll(genie, romeo, felicidad);

        // Create Genies's and Linda's children
        TreeItem<String> jun =  new TreeItem<>("Jun and Blessie");
        genie.getChildren().addAll(jun);

        // Create Jun and Blessie's children
        TreeItem<String> mylene =  new TreeItem<>("Mylene");
        TreeItem<String> michael =  new TreeItem<>("Michael");
        TreeItem<String> mark =  new TreeItem<>("Mark");
        jun.getChildren().addAll(mylene, michael, mark);

        // Create Romeo's and Cely's children
        TreeItem<String> aida =  new TreeItem<>("Aida and Boy");
        TreeItem<String> romeoJr =  new TreeItem<>("RomeoJr and Maryann");
        TreeItem<String> emily =  new TreeItem<>("Emily");
        TreeItem<String> gerry =  new TreeItem<>("Gerry");
        romeo.getChildren().addAll(aida, romeoJr, emily, gerry);

        // Create RomeoJr's and Maryann's children
        TreeItem<String> nino =  new TreeItem<>("Nino");
        TreeItem<String> roanne =  new TreeItem<>("Roanne");
        TreeItem<String> laurent =  new TreeItem<>("Laurent");
        romeoJr.getChildren().addAll(nino, roanne, laurent);

        // Create Felicidad's child
        TreeItem<String> ann =  new TreeItem<>("Ann");
        TreeItem<String> edgardoJr =  new TreeItem<>("EdgardoJr and Arlene");
        TreeItem<String> john =  new TreeItem<>("John and Fatima");
        TreeItem<String> peter =  new TreeItem<>("Peter and Lisa");
        felicidad.getChildren().addAll(ann, edgardoJr, john, peter);

        TreeView<String> treeView = new TreeView<>(root);
        
        Scene scene = new Scene(treeView, 600, 500);
        primaryStage.setTitle("Tree Exhibition Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }    
}

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class JavaFXMenu extends Application{
	@Override
	public void start(Stage primaryStage) {
		MenuBar menuBar = new MenuBar();
		
		//file menu
		Menu fileMenu = new Menu("File");
		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");
		MenuItem exitItem = new MenuItem("Exit");
		exitItem.setOnAction(e -> System.exit(0)); //exit app
		fileMenu.getItems().addAll(newItem, openItem, new SeparatorMenuItem(), exitItem);
		
		//EditMenu
		Menu editMenu = new Menu("Edit");
		MenuItem cutItem = new MenuItem("cut");
		MenuItem copyItem = new MenuItem("Copy");
	    MenuItem pasteItem = new MenuItem("Paste");
	    editMenu.getItems().addAll(cutItem, copyItem, pasteItem);
	    
	 // Help Menu
        Menu helpMenu = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");
        helpMenu.getItems().add(aboutItem);

        // Add menus to MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Layout
        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Menu");
        primaryStage.show();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}

package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JavaFXLayouts extends Application {
    @Override
    public void start(Stage primaryStage) {
        // HBox layout
        HBox hbox = new HBox();
        hbox.getChildren().addAll(new Button("HBox 1"), new Button("HBox 2"));

        // VBox layout
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Button("VBox 1"), new Button("VBox 2"));

        // StackPane layout
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(new Button("StackPane 1"), new Button("StackPane 2"));

        // BorderPane layout
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Button("Top"));
        borderPane.setBottom(new Button("Bottom"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setRight(new Button("Right"));
        borderPane.setCenter(new Button("Center"));

        // GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.add(new Button("GridPane 1"), 0, 0);
        gridPane.add(new Button("GridPane 2"), 1, 0);
        gridPane.add(new Button("GridPane 3"), 0, 1);
        gridPane.add(new Button("GridPane 4"), 1, 1);

        // FlowPane layout
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(new Button("FlowPane 1"), new Button("FlowPane 2"));

        // TilePane layout
        TilePane tilePane = new TilePane();
        tilePane.getChildren().addAll(new Button("TilePane 1"), new Button("TilePane 2"));

        // Creating a VBox as the root layout to showcase all other layouts
        VBox root = new VBox(10); // 10px spacing between children
        root.getChildren().addAll(hbox, vbox, stackPane, borderPane, gridPane, flowPane, tilePane);

        Scene scene = new Scene(root, 400, 600);

        primaryStage.setTitle("JavaFX Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

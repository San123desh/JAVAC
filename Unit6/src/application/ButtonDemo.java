package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ButtonDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a button and set its text
        Button button = new Button("Click Me");

        // Set an action to perform when the button is clicked
        button.setOnAction(e -> System.out.println("Button Clicked!"));

        // Create a layout pane to hold the button
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Create a scene with the layout pane
        Scene scene = new Scene(layout, 300, 200);

        // Set up the stage
        primaryStage.setTitle("Button Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

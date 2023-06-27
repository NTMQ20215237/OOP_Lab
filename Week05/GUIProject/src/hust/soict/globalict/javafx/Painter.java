package hust.soict.globalict.javafx;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.application.*;

public class Painter extends Application {
	public void start(Stage stage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));
		
		Scene scene =new Scene(root);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
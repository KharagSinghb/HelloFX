/**
 * @author Kharag
 * date 06/03/2024
 * A login screen using JavaFX 🐐
 */
//start
package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/Login.fxml")
		);
		Scene scene = new Scene(root);
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	/**
	 * launch code
	 * @param args main method
	 */
	public static void main(String[] args) {
		launch(args);
	}
}//end
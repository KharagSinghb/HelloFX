package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
/**
 * main class
 */
public class MainAppController implements Initializable {
	@FXML
	public WebView webView;
	
	@FXML
	public TextField textField;
	
	private WebEngine engine;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		engine = webView.getEngine();
		loadPage();
	}
	/**
	 * web page
	 */
	public void loadPage() {
		engine.load("https://github.com/KharagSinghb");
	}
}

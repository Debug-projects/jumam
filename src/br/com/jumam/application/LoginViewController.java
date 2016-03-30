package br.com.jumam.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import br.com.jumam.application.Main;

public class LoginViewController {


	@FXML
	private ResourceBundle resources;
	
	@FXML
	
	private URL location;
	@FXML
	
	void initialize() {	
	}
	
	@FXML
	private void handleCancelar(){
		Main.primaryStage.close();
	}
	
	@FXML
	private void handleLogar(){
		
	}
}

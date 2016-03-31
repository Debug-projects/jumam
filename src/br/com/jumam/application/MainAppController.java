package br.com.jumam.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MainAppController {
	
	@FXML
	private MenuItem close;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {  	
    }
    
    @FXML
    private void handleFechar(){
		Main.stageRoot.close();
    }
}
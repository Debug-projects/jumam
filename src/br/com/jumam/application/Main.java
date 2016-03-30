package br.com.jumam.application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	
	private BorderPane root;
	public static Stage primaryStage;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.root = (BorderPane)FXMLLoader.load(getClass().getResource("MainApp.fxml"));
			Scene scene = new Scene(root,800,640);
			
			Main.primaryStage = primaryStage;
			Main.primaryStage.setTitle("JUMAM");
			Main.primaryStage.setResizable(false);
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		login();
		
	}
	
	private void login() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("LoginView.fxml"));
			AnchorPane login = (AnchorPane)loader.load();
			root.setCenter(login);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}

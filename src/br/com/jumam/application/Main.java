package br.com.jumam.application;
	


import br.com.jumam.edita.EntryViewController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static Stage stageLogin;
	public static Stage stageRoot;
	public static Stage stageEntry;
	private static BorderPane root;
	private static BorderPane rootEntry;
	
	
	@Override
	public void start(Stage primaryStage) {		
		login(primaryStage);		
	}
	
	public static void rootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("MainApp.fxml"));
			root = (BorderPane)loader.load();
			Scene scene = new Scene(root,1024,640);			
			stageRoot = new Stage();
			stageRoot.setTitle("JUMAM");
			stageRoot.setResizable(false);
			stageRoot.setScene(scene);
			stageRoot.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void login(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("LoginView.fxml"));
			AnchorPane login = (AnchorPane)loader.load();
			Scene sceneLogin = new Scene(login,400,200);
			stageLogin = primaryStage;
			stageLogin.setTitle("Login");
			stageLogin.setResizable(false);
			stageLogin.setScene(sceneLogin);
			stageLogin.show();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void process(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("ProcessView.fxml"));
			AnchorPane process = (AnchorPane)loader.load();
			root.setCenter(process);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void entry() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("RootEntry.fxml"));
			rootEntry = (BorderPane)loader.load();
			Scene sceneEntry = new Scene(rootEntry,565,400);
			stageEntry = new Stage();
			stageEntry.setResizable(false);
			stageEntry.setScene(sceneEntry);
			stageEntry.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void inserir() {
		entry();
		try {
			EntryViewController controller = new EntryViewController();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(EntryViewController.class.getResource("EntryView.fxml"));
			loader.setController(controller);
			AnchorPane inserir = (AnchorPane)loader.load();
			stageEntry.setTitle("Inserir");
			rootEntry.setCenter(inserir);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void corrigir() {
		entry();
		try {
			EditViewController controller = new EditViewController();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(EntryViewController.class.getResource("EntryView.fxml"));
			loader.setController(controller);
			AnchorPane inserir = (AnchorPane)loader.load();
			stageEntry.setTitle("Inserir");
			rootEntry.setCenter(inserir);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
}

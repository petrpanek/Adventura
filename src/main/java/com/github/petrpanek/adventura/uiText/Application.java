package com.github.petrpanek.adventura.uiText;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Třída slouží ke spuštění adventury.
 * Při spuštění bez parametru konstruuje okno aplikace,
 * s parametrem -text se spouští v textovém režimu
 * 
 * @author Petr Panek
 *
 */
public class Application extends javafx.application.Application {
	
	/**
	 * Spouštěcí metoda pro aplikaci
	 * @param args
	 */
	public static void main(String[] args) {
        launch(args);
	}

	/**
	 * Metoda, ve které se konstruuje okno, kontroler a hra,
	 * která se předává kontroleru
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
	        // Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
	        
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource("Home.fxml"));
	        Parent root = loader.load();
	        
	        HomeController c = loader.getController();
	        
	        primaryStage.setTitle("title");
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
	}

}
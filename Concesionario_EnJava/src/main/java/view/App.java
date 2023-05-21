package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.stage.StageStyle;


public class App extends Application {

    private static Scene scene;

  
    @Override
    public  void start(Stage primaryStage) throws IOException{
     
        Parent root =FXMLLoader.load(getClass().getResource("Login.fxml"));
        
       
       Scene escena= new Scene (root);
       primaryStage.setScene(escena);
       primaryStage.initStyle(StageStyle.UNDECORATED);
       primaryStage.show();
      
      
    }
   
    public static void main(String[] args) {
        launch();
    }
}
package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {


    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader login= new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root=login.load();
        Scene loginScene=new Scene(root);
        stage.setScene(loginScene);
        stage.show();
    }





    public static void main(String[] args) {
        launch();
    }

}
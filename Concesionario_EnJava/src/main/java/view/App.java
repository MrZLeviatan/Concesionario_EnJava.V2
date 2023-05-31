package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Administrador;
import modelo.Genero;

import static javafx.stage.StageStyle.UNDECORATED;
import static view.consecionarioInstance.INSTANCE;

/**
 * JavaFX App
 */

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        INSTANCE.getConsesionario().addAministrador(new Administrador("juan","123",12,"123", Genero.MASCULINO,"123","lolsito"));
        FXMLLoader login= new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root=login.load();
        Scene loginScene=new Scene(root);
        stage.initStyle(UNDECORATED);
        stage.setScene(loginScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
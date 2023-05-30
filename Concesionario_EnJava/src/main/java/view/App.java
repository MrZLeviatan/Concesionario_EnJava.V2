package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Modelo.Administrador;
import Modelo.Genero;

import static javafx.stage.StageStyle.UNDECORATED;
//import static view.consecionarioInstance.INSTANCE;

/**
 * JavaFX App
 */
public class App extends Application {


    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        final Administrador adm= new Administrador("JEFE","admintucarro@gmail.com",19,25693,Genero.MASCULINO,"admin123","admintotal");
       // INSTANCE.getConsesionario().addAministrador(adm);
        FXMLLoader login= new FXMLLoader(getClass().getResource("Empleado.fxml"));
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
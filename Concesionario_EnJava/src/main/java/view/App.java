package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Administrador;
import modelo.Empleado;
import modelo.Genero;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaFX App
 */
public class App extends Application {


    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        final Administrador adm= new Administrador("JEFE","admintucarro@gmail.com",19,25693,Genero.MASCULINO,"admin123","admintotal");
        List<Empleado>empleadoList= new ArrayList<>();
        List<Administrador>administradorList= new ArrayList<>();
        administradorList.add(adm);
        FXMLLoader login= new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root=login.load();
        LoginController controller= login.getController();
        Scene loginScene=new Scene(root);
        stage.setScene(loginScene);
        stage.show();
        controller.init(stage,empleadoList,administradorList);
    }





    public static void main(String[] args) {
        launch();
    }

}
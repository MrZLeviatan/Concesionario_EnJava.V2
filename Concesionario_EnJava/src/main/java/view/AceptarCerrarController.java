package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Administrador;
import modelo.Empleado;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AceptarCerrarController {

    private Stage stageAceptarCerrar;
    private Stage stageCarro1;
    private List<Empleado> empleadoListAceptarCerrar = new ArrayList<>();
    private List<Administrador> administradorListAceptarCerrar = new ArrayList<>();

    private String correo1;

    public void init(Stage stageCarro, List<Empleado> empleadoListCarrosController, List<Administrador> administradorListCarrosController, String correo, Stage stage) {
        stageCarro1=stageCarro;
        stageAceptarCerrar=stage;
        empleadoListAceptarCerrar=empleadoListCarrosController;
        administradorListAceptarCerrar=administradorListCarrosController;
        correo1=correo;
    }


    @FXML
    private Button aceptarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    void aceptarCerrar(ActionEvent event) throws IOException {
        FXMLLoader login= new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root=login.load();
        LoginController controller= login.getController();
        Scene loginScene=new Scene(root);
        Stage stage= new Stage();
        stage.setScene(loginScene);
        stage.show();
        controller.init(stage,empleadoListAceptarCerrar,administradorListAceptarCerrar);
        stageCarro1.close();

    }

    @FXML
    void cancelarCerrar(ActionEvent event) {
        stageAceptarCerrar.close();

    }


}

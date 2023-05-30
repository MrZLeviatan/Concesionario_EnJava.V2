package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import Modelo.Administrador;
import Modelo.Empleado;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrosController {
    private Stage stageCarro;
    private List<Empleado> empleadoListCarrosController = new ArrayList<>();
    private List<Administrador> administradorListCarrosController = new ArrayList<>();

    private String correo;

    public void init(Stage stage, List<Empleado> empleadoListLogin, List<Administrador> administradorListLogin, String correoUsuario) {
        stageCarro=stage;
        empleadoListCarrosController=empleadoListLogin;
        administradorListCarrosController=administradorListLogin;
        correo=correoUsuario;
    }


    @FXML
    private Button cerrarSeccion;

    @FXML
    void cerrarSeccion(ActionEvent event) throws IOException {
        FXMLLoader cerrarSeccion = new FXMLLoader(getClass().getResource("aceptarCerrar.fxml"));
        Parent root= cerrarSeccion.load();
        AceptarCerrarController controller= cerrarSeccion.getController();
        Scene scene= new Scene(root);
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
        controller.init(stageCarro,empleadoListCarrosController,administradorListCarrosController,correo,stage);


    }


}

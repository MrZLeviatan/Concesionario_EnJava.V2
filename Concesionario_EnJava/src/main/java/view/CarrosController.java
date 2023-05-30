package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CarrosController {
    private GridPane gridPane;
    private String correo;

    @FXML
    private Button cerrarSeccion;

    @FXML
    void cerrarSeccion(ActionEvent event) throws IOException {
        FXMLLoader cerrarSeccion = new FXMLLoader(getClass().getResource("aceptarCerrar.fxml"));
        Parent root= cerrarSeccion.load();
        Scene scene= new Scene(root);
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.show();
    }



}

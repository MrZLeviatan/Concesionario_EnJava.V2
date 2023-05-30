package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.StageStyle.UNDECORATED;

public class ListaVehiculosController {

    @FXML
    private Label Volver;

    @FXML
    private Label X;

    @FXML
    void labCerrar(MouseEvent event) {System.exit(0);}

    public void EventoVolver (MouseEvent event) throws IOException {

        //SE CREA LA ESCENA DE VOLVER

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Empleado.fxml"));
        Parent root= loader.load();

        //SE CREA STAGE QUE SON LOS CONTROLADORES DE LA ESCENA
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        Node source = (Node) event.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.close();
        stage.show();
    }
}
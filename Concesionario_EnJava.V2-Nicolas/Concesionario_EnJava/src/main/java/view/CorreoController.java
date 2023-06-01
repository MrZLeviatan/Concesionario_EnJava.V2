package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import static view.consecionarioInstance.INSTANCE;

public class CorreoController {

    @FXML
    private TextField bloqueCorreo;

    @FXML
    private TextField bloquePalabra;

    @FXML
    private Button botonCerrar;

    @FXML
    private Button botonIngresar;

    @FXML
    private Label x;

    @FXML
    private void labCerrar(MouseEvent event) throws IOException{
        Stage stage= (Stage) this.x.getScene().getWindow();
        stage.close();

}


    @FXML
    private void eventoRecuperar (ActionEvent event) throws IOException {
        INSTANCE.getConsesionario().enviarCorreo(bloqueCorreo.getText(),INSTANCE.getConsesionario().obtenerPassawordEmp(bloqueCorreo.getText()));
    }
    @FXML
    private void ingresar(ActionEvent event) throws IOException {

        if(INSTANCE.getConsesionario().verificarPalabraSecretaAdm(bloqueCorreo.getText(),bloquePalabra.getText())){

            FXMLLoader loader= new FXMLLoader(getClass().getResource("Administrador.fxml"));
            Parent root= loader.load();
            Scene scene= new Scene(root);
            Stage stage= new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.showAndWait();

            INSTANCE.getConsesionario().verificarExistencia(INSTANCE.getConsesionario().buscarAdm(bloqueCorreo.getText()));

        }
        else if (INSTANCE.getConsesionario().verificarPalabraSecretaEmpleados(bloqueCorreo.getText(),bloquePalabra.getText())){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Empleado.fxml"));
            Parent root= loader.load();
            Scene scene= new Scene(root);
            Stage stage= new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.showAndWait();
        }
        else {
            //
        }




    }
}




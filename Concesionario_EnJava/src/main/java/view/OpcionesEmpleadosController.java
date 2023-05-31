package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.StageStyle.UNDECORATED;

public class OpcionesEmpleadosController {

    @FXML
    private Button botonActualizar;

    @FXML
    private Button botonEliminar;

    @FXML
    private Button botonRegistrar;

    @FXML
    private Label volver;

    @FXML
    private Label x;


    @FXML
    void labCerrar(MouseEvent event) {System.exit(0);}

    public void EventoVolver (MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Administrador.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        Node source = (Node) event.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.hide();
        stage.show();
    }
   public void EventoRegistro (ActionEvent event) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrarEmpleado.fxml"));
       Parent root= loader.load();
       Stage stage = new Stage();
       stage.initStyle(UNDECORATED);
       stage.setScene(new Scene(root));
       Node source = (Node) event.getSource();
       Stage stage2 = (Stage) source.getScene().getWindow();
       stage2.hide();
       stage.show();

   }

    public void EventoEliminar (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BuscadorEmpleado.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        stage.show();

   }
}


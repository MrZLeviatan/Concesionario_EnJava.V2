package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

import static javafx.stage.StageStyle.UNDECORATED;

public class EmpleadoController {

    @FXML
    private TextField BloqueCedula;
    @FXML
    private TextField BloqueCorreo;
    @FXML
    private TextField BloqueNombre;
    @FXML
    private Rectangle FondoRojo;
    @FXML
    private ImageView Imagen;
    @FXML
    private ImageView ImagenPerfil;
    @FXML
    private Label NombreEmpleado;
    @FXML
    private Label Volver;
    @FXML
    private Label X;
    @FXML
    private Button generarReporteEmpleado;
    @FXML
    private Label textoCedula;
    @FXML
    private Label textoCorreo;
    @FXML
    private Label textoNombre;
    @FXML
    private Button Carros;

    @FXML
    void labCerrar(MouseEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AceptarCerrar.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.showAndWait();

    }

    @FXML

    public void EventoVolver (MouseEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        Node source = (Node) event.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.close();
        stage.show();
    }

    public void EventoListaVehiculos (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListaVehiculos.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        Node source = (Node) event.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.close();
        stage.show();
    }

}
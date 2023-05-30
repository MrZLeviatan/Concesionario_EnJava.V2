/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static view.consecionarioInstance.INSTANCE;



/**
 * FXML Controller class
 *
 * @author Mr. Nicolas
 */
public class LoginController implements Initializable {
    @FXML
    private TextField BloqueUsuario;

    @FXML
    private PasswordField BloqueContraseña;

    private String correoUsuario;
    private String contraseñaUsuario;

    @FXML
    private Button BotonIngrese;

    @FXML
    private Button BotonRecuperar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //boton de cerrar
    @FXML
    private void labCerrar(MouseEvent event) {
        System.exit(0);
    }


    //evento que revisa que no haya espacios en blanco
    @FXML
    private void eventEspaciosBlancos(KeyEvent event) throws IOException {

        Object evt = event.getSource();

        if (evt.equals(BloqueUsuario)) {
            if (event.getCharacter().equals(" ")) {
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueUsuario.setText("");
            }

        } else if (evt.equals(BloqueContraseña)) {


            if (event.getCharacter().equals(" ")) {
                Alert alert1= new Alert(Alert.AlertType.NONE);
                alert1.setTitle("ERROR");
                alert1.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert1.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert1.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert1.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert1.showAndWait();
                BloqueContraseña.setText("");

            }

        }

    }

    //abre ventana para recuperar contraseña
    @FXML
    private void EventoRecuperar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RecuperarContraseña.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.showAndWait();
    }

    //valida que los datos esten correctos y genera la siguiente interfaz
    @FXML
    public void eventoValidacion(ActionEvent event) throws Exception {

        correoUsuario= BloqueUsuario.getText();
        contraseñaUsuario = BloqueContraseña.getText();
        if(INSTANCE.getConsesionario().verificarAdm(correoUsuario,contraseñaUsuario)){
            FXMLLoader administrador= new FXMLLoader(getClass().getResource("Administrador.fxml"));
            Object controller= administrador.getController();
            Parent root= administrador.load();
            Scene scene= new Scene(root);
            Stage stage= new Stage();
            stage.setScene(scene);
            stage.show();

        } else if(INSTANCE.getConsesionario().verificarEmpleado(correoUsuario,contraseñaUsuario)){
            FXMLLoader empleado= new FXMLLoader(getClass().getResource("Empleado.fxml"));
            Parent root1= empleado.load();
            Scene scene= new Scene(root1);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else{
           //


        }
    }

}


       
      






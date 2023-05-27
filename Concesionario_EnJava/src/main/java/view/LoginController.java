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
import modelo.Administrador;
import modelo.Empleado;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static view.consecionarioInstance.INSTANCE;


/**
 * FXML Controller class
 *
 * @author Mr. Nicolas
 */
public class LoginController implements Initializable {
    private Stage stageLogin;

    private List<Empleado> empleadoListLogin = new ArrayList<>();
    private List<Administrador> administradorListLogin = new ArrayList<>();

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


    //metodo para inicializar las variable y guardarlas

    public void init(Stage stage) {
        stageLogin = stage;
    }


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
                alert.setTitle("ERROR!!!");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueUsuario.setText("");
            }

        } else if (evt.equals(BloqueContraseña)) {


            if (event.getCharacter().equals(" ")) {
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!!");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueContraseña.setText("");

            }

        }

    }

    //abre ventana para recuperar contraseña
    @FXML
    private void EventoRecuperar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RecuperarContraseña.fxml"));
        Parent root = loader.load();
        RecuperarContraseñaController controller = loader.getController();
        Scene scene = new Scene(root);

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.showAndWait();
    }

    //valida que los datos esten correctos y genera la siguiente interfaz
    @FXML
    private void EventoValidacion(ActionEvent event) throws IOException {
        correoUsuario = BloqueUsuario.getText();
        contraseñaUsuario = BloqueContraseña.getText();
        if(INSTANCE.getConsesionario().verificarAdm(correoUsuario)==true){
            if(INSTANCE.getConsesionario().validarContraseña(contraseñaUsuario,correoUsuario)==true){
                FXMLLoader carros = new FXMLLoader(getClass().getResource("Carros.fxml"));
                Parent root = carros.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                this.stageLogin.close();
            }
            else{
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueUsuario.setText("");

            }
        }
        else{
            if(INSTANCE.getConsesionario().validarContraseña(contraseñaUsuario,correoUsuario)==true){
                FXMLLoader carros = new FXMLLoader(getClass().getResource("Carros.fxml"));
                Parent root = carros.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                this.stageLogin.close();
            }
            else {
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueUsuario.setText("");
            }
        }
    }
}


       
      






package view;

import javafx.event.*;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import modelo.Consesionario;

public class LoginController {

    @Override
    void initialize(URL url,ResourceBundle rb){
        //TODO
    }


    @FXML
    private PasswordField BloqueContraseña;

    @FXML
    private TextField BloqueUsuario;

    @FXML
    private Button BotonIngrese;

    @FXML
    private Button BotonRecuperar;

    @FXML
    private Rectangle FondoRojo;

    @FXML
    private ImageView ImagenLoco;

    @FXML
    private ImageView Logo;

    @FXML
    private Pane PanelBlanco;

    @FXML
    private Separator Separador;

    @FXML
    private Label TextContraseña;

    @FXML
    private Label TextoUsuario;

    @FXML
    void EventButton(ActionEvent event) {
        String correo= BloqueUsuario.getText();
        String contraseña= BloqueContraseña.getText();

        if(Consesionario.verificarContraseña(correo,contraseña)==true){
            //aca deberia seguir la siguiente interfas
        }
        else{
            //aca debe aparecer una interfas o un panel que diga contraseña incorrecta
        }


    }



}
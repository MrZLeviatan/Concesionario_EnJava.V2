/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;
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

/**
 * FXML Controller class
 *
 * @author Mr. Nicolas
 */
public class LoginController implements Initializable {
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


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


}

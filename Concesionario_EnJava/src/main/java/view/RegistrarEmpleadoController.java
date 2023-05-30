package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class RegistrarEmpleadoController {

    @FXML
    private TextField BloqueCedula;

    @FXML
    private TextField BloqueContraseña;

    @FXML
    private TextField BloqueCorreo;

    @FXML
    private TextField BloqueEdad;

    @FXML
    private TextField BloqueNombre;

    @FXML
    private Button BotonCancelar;

    @FXML
    private RadioButton BotonFemenino;

    @FXML
    private RadioButton BotonOtros;

    @FXML
    private Button BotonRegistrar;

    @FXML
    private RadioButton ButtonMasculino;

    @FXML
    private Rectangle FondoRojo;

    @FXML
    private ImageView ImagenLogo;

    @FXML
    private ImageView ImagenLogo2;

    @FXML
    private Separator Separador;

    @FXML
    private Label TextoCedula;

    @FXML
    private Label TextoContraseña;

    @FXML
    private Label TextoCorreo;

    @FXML
    private Label TextoEdad;

    @FXML
    private Label TextoGenero;

    @FXML
    private Label TextoNombre;

    @FXML
    private Text TextoRegistro;

    @FXML
    void EventoAgregar(ActionEvent event) {

    }

    @FXML
    void Eventocancelar(MouseEvent event) {

    }

    @FXML
    void eventEspaciosBlancos(MouseEvent event) {


    }

}

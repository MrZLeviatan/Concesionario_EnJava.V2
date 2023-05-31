package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import modelo.Empleado;
import modelo.Estado;
import modelo.Genero;

import static view.consecionarioInstance.INSTANCE;

public class RegistrarEmpleadoController {
    private Estado estado;

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
    private HBox hbox;

    @FXML
    private GridPane tablaorden;

    @FXML
    private ToggleGroup genero;
   // @FXML

    //private Genero obtenerGenero() {

     //   RadioButton radioButton = (RadioButton) genero.getSelectedToggle();
      //  if (radioButton != null) {
       //     return Genero.valueOf(radioButton.getText().toUpperCase());
      //  }
       // return null;
   // }
    @FXML
    void EventoAgregar(ActionEvent event) throws Exception {
        estado=Estado.ACTIVO;
        Empleado empleado = new Empleado(BloqueNombre.getText(),BloqueCorreo.getText(),Integer.parseInt(BloqueEdad.getText()),BloqueCedula.getText(),Genero.MASCULINO,BloqueContraseña.getText(),"LOLSITO", estado);
        INSTANCE.getConsesionario().addEmpleado(empleado);

    }

    @FXML
    void Eventocancelar(MouseEvent event) {

    }

    @FXML
    void eventEspaciosBlancos(MouseEvent event) {


    }

}

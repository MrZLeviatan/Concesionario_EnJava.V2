
package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class AdministradorController {

    @FXML
    private TextField BloqueCedula;

    @FXML
    private TextField BloqueCorreo;

    @FXML
    private TextField BloqueNombre;

    @FXML
    private MenuItem BotonActualizarEmpleado;

    @FXML
    private MenuItem BotonCuotaEmpleado;

    @FXML
    private MenuItem BotonEliminarEmpleado;

    @FXML
    private Button BotonGerencia;

    @FXML
    private MenuItem BotonRegistrarEmpleado;

    @FXML
    private Rectangle FondoRojo;

    @FXML
    private ImageView ImagenPerfil;

    @FXML
    private ImageView LogoLetras;

    @FXML
    private MenuButton MenuBotonEmpleado;

    @FXML
    private MenuButton MenuBotonRegistro;

    @FXML
    private AnchorPane Panel;

    @FXML
    private Separator Separador;

    @FXML
    private Separator SeparadorBlanco;

    @FXML
    private Label TextoAdministrador;

    @FXML
    private Label TextoCedula;

    @FXML
    private Label TextoCorreo;

    @FXML
    private Label TextoNombre;

    @FXML
    private Label Volver;

    @FXML
    private Label X;

    @FXML
    void labCerrar(MouseEvent event) {System.exit(0);}

}

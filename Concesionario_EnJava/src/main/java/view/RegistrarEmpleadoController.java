package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrarEmpleadoController {

    @FXML
    private TextField BloqueContraseña;

    @FXML
    private TextField BloqueCedula;

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
    private void Eventocancelar (ActionEvent event){

        Stage stage= (Stage) this.BotonCancelar.getScene().getWindow();
        stage.close();

    }
    @FXML
    private void eventEspaciosBlancos (ActionEvent event) throws IOException {

       String nombre = BloqueNombre.getText();
      String cedula = BloqueCedula.getText();
        // String genero
        int edad= Integer.parseInt(BloqueEdad.getText());
        String correo= BloqueCorreo.getText();
        String contraseña = BloqueContraseña.getText();


        if(nombre.isEmpty() && cedula.isEmpty() && edad==0 && correo.isEmpty() && contraseña.isEmpty()){
                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!!");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();

            }

        }
}
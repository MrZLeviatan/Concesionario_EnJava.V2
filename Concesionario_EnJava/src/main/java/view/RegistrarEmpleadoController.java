package view;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Empleado;
import modelo.Estado;
import modelo.Genero;

import java.io.IOException;
import java.util.List;

import static javafx.stage.StageStyle.UNDECORATED;
import static view.consecionarioInstance.INSTANCE;

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
    private TextField bloquePalabraSecreta;

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
    private ToggleGroup genero;

    @FXML
    void EventoAgregar(ActionEvent event) throws Exception {

        String nombre = BloqueNombre.getText();
        String contraseña = BloqueContraseña.getText();
        String correo = BloqueCorreo.getText();
        String edad=BloqueEdad.getText();
        String cedula= BloqueCedula.getText();
        String palabraSecreta = bloquePalabraSecreta.getText();


        if (nombre.isEmpty() && contraseña.isEmpty() && correo.isEmpty() && edad.isEmpty()
                && cedula.isEmpty() && palabraSecreta.isEmpty()) {

            Alert alert1 = new Alert(Alert.AlertType.NONE);
            alert1.setTitle("ERROR!!!");
            alert1.setContentText("POR FAVOR LLENAR LOS BLOQUES VACIOS...");
            alert1.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenLlenarEspacios .png").toString()));
            alert1.setHeaderText("UPS! PARECE QUE SE TE OLVIDO ALGO");
            alert1.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
            alert1.showAndWait();
            BloqueContraseña.setText("");
            bloquePalabraSecreta.setText("");



        }else {

            Estado estado = Estado.ACTIVO;
            Empleado empleado = new Empleado(BloqueNombre.getText(), BloqueCorreo.getText(), Integer.parseInt(BloqueEdad.getText()), BloqueCedula.getText(), obtenerGenero(), BloqueContraseña.getText(), bloquePalabraSecreta.getText(), estado);
            INSTANCE.getConsesionario().addEmpleado(empleado);

            Alert alert1 = new Alert(Alert.AlertType.NONE);
            alert1.setTitle("REGISTRO COMPLETO");
            alert1.setContentText("EMPLEADO REGISTRADO");
            alert1.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenBienvenidoLogo.png").toString()));
            alert1.setHeaderText("BIENVENIDO A HELL TAKER CONCESIONARIO");
            alert1.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
            alert1.showAndWait();
            BloqueNombre.setText("");
            BloqueContraseña.setText("");
            BloqueEdad.setText("");
            BloqueCedula.setText("");
            BloqueCorreo.setText("");
            bloquePalabraSecreta.setText("");
        }


    }
    @FXML
    void Eventocancelar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OpcionesEmpleados.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        Node source = (Node) event.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.hide();
        stage.show();
    }
    @FXML

    private void restriccionTeclas (KeyEvent event){
        if(event.getTarget()== BloqueEdad ){
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!!");
                alert.setContentText("NO SE PERMITEN LETRAS EN LA EDAD");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueEdad.setText("");
            }
        }else if(event.getTarget()== BloqueCedula ) {
            if (!Character.isDigit(event.getCharacter().charAt(0))) {
                Alert alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!!");
                alert.setContentText("NO SE PERMITEN LETRAS EN LA CEDULA");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueCedula.setText("");

            }
        }
    }

    private Genero obtenerGenero(){
        RadioButton radioButton = (RadioButton) genero.getSelectedToggle();
        if( radioButton != null ){
            return Genero.valueOf( radioButton.getText().toUpperCase() );
        }
        return null;
    }





}
package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.StageStyle.UNDECORATED;
import static view.consecionarioInstance.INSTANCE;

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

    public  void iniciarlizarLabels(){
        TextoCorreo.setText(INSTANCE.getConsesionario().getPersonaverificada().getCorreo());
        TextoNombre.setText(INSTANCE.getConsesionario().getPersonaverificada().getNombre());
        TextoCedula.setText(INSTANCE.getConsesionario().getPersonaverificada().getCc());
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

    public void EventoTroll (ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("ERROR!!!");
        alert.setContentText("EN PROCESO DE CONSTRUCCION...");
        alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenDisculpa.png").toString()));
        alert.setHeaderText("HEY, QUE HACES AQUI???");
        alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
        alert.showAndWait();
    }

    public void EventoRegistrar (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RegistrarEmpleado.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        stage.show();

    }


    public void EventoBuscarEmpleado(ActionEvent actionEvent) {
    }
}
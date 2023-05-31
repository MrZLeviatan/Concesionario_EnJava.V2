package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import static view.consecionarioInstance.INSTANCE;
public class BuscadorEmpleadoController {

    @FXML
    private TextField BloqueCedula;

    @FXML
    private Button BotonBuscar;

    @FXML
    private Rectangle FondoRojo;

    @FXML
    private Label TextoBuscar;

    @FXML
    private Button X;


    @FXML
    private void cerrarventa (ActionEvent event){

        Stage stage= (Stage) this.X.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void eventoValidacion (ActionEvent event){

        Object evt=event.getSource();

        if(evt.equals(BotonBuscar)){

            if(!BloqueCedula.getText().isEmpty()){

                INSTANCE.getConsesionario().eliminarEmpleado(BloqueCedula.getText());

                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("AVISO!!!");
                alert.setContentText("EMPLEADO ELIMINADO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenBienvenidoLogo.png").toString()));
                alert.setHeaderText("ACTION COMPLETADA...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();




            }else{
                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!!");
                alert.setContentText("POR FAVOR LLENAR LOS ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenLlenar.png").toString()));
                alert.setHeaderText("UPS! PARECE QUE SE TE OLVIDO ALGO...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();


            }

        }

    }

 }
package view;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelo.Empleado;

import java.io.IOException;
import java.util.List;

import static javafx.stage.StageStyle.UNDECORATED;

public class OpcionesEmpleadosController {

    @FXML
    private TableView<Empleado> tablaEmpleados;
    @FXML
    private TableColumn<?, ?> tCedula;

    @FXML
    private TableColumn<?, ?> tContraseña;

    @FXML
    private TableColumn<?, ?> tCorreo;

    @FXML
    private TableColumn<?, ?> tNombres;


    @FXML
    private Button botonActualizar;

    @FXML
    private Button botonEliminar;

    @FXML
    private Button botonRegistrar;

    @FXML
    private Label volver;

    @FXML
    private Label x;
    
    @FXML
    void labCerrar(MouseEvent event) {System.exit(0);}

    public void EventoVolver (MouseEvent event) throws IOException {
        FXMLLoader admin = new FXMLLoader(getClass().getResource("Administrador.fxml"));
        Parent root= admin.load();
        Stage stageAdmin = new Stage();
        stageAdmin.initStyle(UNDECORATED);
        stageAdmin.setScene(new Scene(root));
        Node source = (Node) event.getSource();
        Stage stage2 = (Stage) source.getScene().getWindow();
        stage2.hide();
        stageAdmin.show();
    }
   public void EventoRegistro (ActionEvent event) throws IOException {
       FXMLLoader loader1 = new FXMLLoader(getClass().getResource("RegistrarEmpleado.fxml"));
       Parent root= loader1.load();
       Stage stage = new Stage();
       stage.initStyle(UNDECORATED);
       stage.setScene(new Scene(root));
       Node source = (Node) event.getSource();
       Stage stage2 = (Stage) source.getScene().getWindow();
       stage2.hide();
       stage.show();

   }

    public void EventEliminate(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BuscadorEmpleado.fxml"));
        Parent root= loader.load();
        Stage stage = new Stage();
        stage.initStyle(UNDECORATED);
        stage.setScene(new Scene(root));
        stage.show();

   }

    private void llenarTabla(List<Empleado> empleados) {
        tablaEmpleados.setItems(FXCollections.observableArrayList(empleados));
        tablaEmpleados.refresh();
    }

    private void llenarCampos(Empleado empleado) {
        if (empleado != null) {
           tCedula.setText(empleado.getCc());
           tContraseña.setText(empleado.getClave());
           tNombres.setText(empleado.getNombre());
           tCorreo.setText(empleado.getCorreo());
        }
    }





}


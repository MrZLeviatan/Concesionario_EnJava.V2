/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static view.consecionarioInstance.INSTANCE;


public class RecuperarContraseñaController implements Initializable {

 @FXML
 private Button BotonRecuperar;
   
 @FXML
 
 private Button X;
 
 @FXML
 private TextField bloqueCorreo;
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
        
    @FXML
    private void cerrarventa (ActionEvent event){
       
        Stage stage= (Stage) this.X.getScene().getWindow();
        stage.close();
       
    }
    @FXML
    private void eventEspaciosBlancos (KeyEvent event) throws IOException{
        
       Object evt =event.getSource();
        
        if(evt.equals(bloqueCorreo)){
            if (event.getCharacter().equals(" ")){ 
               Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS BLANCOS");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
            }
   
        }
        //aca va recuperar la invocacion de send mail
    }
    
    @FXML
    private void eventoValidacion (ActionEvent event){
       //INSTANCE.getConsesionario().enviarCorreo(bloqueCorreo.getText(),INSTANCE.getConsesionario().obtenerContraseña(bloqueCorreo.getText()));
        INSTANCE.getConsesionario().enviarCorreo("andrey3681.ay@gmail.com","123");

    }
            
    
}
    


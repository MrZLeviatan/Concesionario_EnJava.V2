/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mr. Nicolas
 */
public class LoginController implements Initializable {
    
   @FXML
    private TextField BloqueUsuario;
    
   @FXML
    private PasswordField BloqueContraseña;
    
   @FXML
    private Button BotonIngrese;
    
   @FXML 
    private Button BotonRecuperar;
   
   
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    @FXML
    private void labCerrar(MouseEvent event){
        System.exit(0);
    }
    
    @FXML
    private void eventKey (KeyEvent event) throws IOException{
        
       Object evt =event.getSource();
        
        if(evt.equals(BloqueUsuario)){
            if (event.getCharacter().equals(" ")){ 
               Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS BLANCOS");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueUsuario.setText("");
            }
                
        }else if(evt.equals(BloqueContraseña)){
            if (event.getCharacter().equals(" ")){  
                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS BLANCOS");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueContraseña.setText("");
                
               
              

            }
        }
       
    }
    
    @FXML
    private void EventoValidacion (ActionEvent event){
        
       Object evt =event.getSource();
       
              
       if(evt.equals(BotonIngrese)){
           
           if(!BloqueUsuario.getText().isEmpty() && !BloqueContraseña.getText().isEmpty()){
               
               String user= BloqueUsuario.getText();
               String pass= BloqueContraseña.getText();
               
           }else{
              Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS BLANCOS");
                alert.setGraphic(new ImageView(this.getClass().getResource("ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
               
                
                
           }  
           
       }       
       
      
}
    
   
    
 
}

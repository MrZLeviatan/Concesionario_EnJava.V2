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
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;






public class RecuperarContraseñaController implements Initializable {

 @FXML
 private Button BotonRecuperar;
   
 @FXML
 
 private Button X;
 
 @FXML
 private TextField BloqueContraseña;
  
    
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
        
        if(evt.equals(BloqueContraseña)){
            if (event.getCharacter().equals(" ")){ 
               Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueContraseña.setText("");
            }
   
        }
    }
    
    @FXML
    private void eventoValidacion (ActionEvent event){
        
        Object evt=event.getSource();
        
         if(evt.equals(BotonRecuperar)){
           
           if(!BloqueContraseña.getText().isEmpty()){
               
               String pass= BloqueContraseña.getText();
               
           }else{
                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!");
                alert.setContentText("PORFAVOR LLENAR LOS DATOS NECESARIOS");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenLlenarEspacios.png").toString()));
                alert.setHeaderText("UPS! PARECE QUE SE TE OLVIDO ALGO...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
               
                
                
           }  
           
       }       
       
    }
            
    
}
    


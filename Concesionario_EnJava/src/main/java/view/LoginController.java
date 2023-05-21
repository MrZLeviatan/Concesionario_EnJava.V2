/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.Consesionario;
import modelo.Seguridad;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


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
    private void eventEspaciosBlancos (KeyEvent event) throws IOException{
        
       Object evt =event.getSource();
        
        if(evt.equals(BloqueUsuario)){
            if (event.getCharacter().equals(" ")){ 
               Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
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
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueContraseña.setText("");
                
               
              

            }
        }
       
    }
    @FXML 
    
     private void EventoRecuperar (ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader (getClass().getResource("/view/RecuperarContraseña.fxml"));
        Parent root= loader.load();
        RecuperarContraseñaController controller= loader.getController();
        Scene scene= new Scene(root);
        
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.showAndWait();
        
        
        
        
    }
    @FXML
    private void EventoValidacion (ActionEvent event){
        
       Object evt =event.getSource();
       
              
       if(evt.equals(BotonIngrese)){
           
           if(!BloqueUsuario.getText().isEmpty() && !BloqueContraseña.getText().isEmpty()){
               
               String user= BloqueUsuario.getText();
               String pass= BloqueContraseña.getText();

               //se valida que los datos ingresados no sean de un administrador para verificar la contraseña
               if(Consesionario.verificarAdm(user)==true){
                  if( Consesionario.verficarClaveAdm(user,pass)==true){
                      //aca iria la siguiente interfas donde aparescan los vehiculos y demas

                  }
                  else {
                      //aca va el panel de error
                  }
               }
               if(Seguridad.validarContraseña(pass,user)==true){

               }
               else {
                   //aca va el panel de error
               }


               
           }else{
                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR");
                alert.setContentText("NO SE PERMITEN ESPACIOS BLANCOS");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("AH OCURRIDO UN ERROR!!");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
               
                
                
           }  
           
       }


       
      
}
    
   
    
 
}

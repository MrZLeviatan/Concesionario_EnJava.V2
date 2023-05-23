
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.sql.*;
import java.util.ArrayList;
import modelo.Administrador;

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
    
     private ArrayList<Administrador>ListaAdministrador;
 
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
                alert.setTitle("ERROR!!");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
                alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                alert.showAndWait();
                BloqueUsuario.setText("");
            }
                
        }else if(evt.equals(BloqueContraseña)){
            if (event.getCharacter().equals(" ")){  
                Alert alert= new Alert(Alert.AlertType.NONE);
                alert.setTitle("ERROR!!");
                alert.setContentText("NO SE PERMITEN ESPACIOS EN BLANCO");
                alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/ImagenError.png").toString()));
                alert.setHeaderText("UPS! HA OCURRIDO UN ERROR...");
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
    private void EventoValidacion (ActionEvent event) throws IOException{
        
       Object evt =event.getSource();

       if(evt.equals(BotonIngrese)){
           
           if(!BloqueUsuario.getText().isEmpty() && !BloqueContraseña.getText().isEmpty()){
               
                    
                   String user= BloqueUsuario.getText();
                   String pass= BloqueContraseña.getText();
                   
                   
                
                   
                   for (int i = 0; i < 10; i++) {
                      
               }
                   
                   /* select nombre,contraseña,correo,privilegio from Usuarios where nombre = 'nicolas';
                   String url= "select nombre, contraseña,correo,privilegio +"
                           + "from Usuarios username ='"+user+"'";
                   
                try {    
                   
                   Connection con= Conexion.obtenerConexion();
                   PreparedStatement ps= con.prepareStatement(url);
                   ResultSet rs = ps.executeQuery();
                   
                   if(rs.next()){
                       //SI EXISTE EL USUARIO GUAPETON
                       String U=rs.getString("nombre");
                       String p=rs.getString("contraseña");
                       String priv=rs.getString("privilegio");
                       
                       
                       if(pass.equals(p)){
                           //VAMOS A JFRAME ADMINISTRADOR O EMPLEADO
                           if(priv.equals("administrador")){
                               FXMLLoader loader= new FXMLLoader(getClass().getResource("Administrador.fxml"));
                               
                               Parent root = loader.load();
                               AdministradorController controlador = loader.getController();
                               
                               Scene scene = new Scene(root);
                               Stage stage = new Stage();
                               
                               stage.setScene(scene);
                               stage.show();
                               
                               stage.setOnCloseRequest(e-> controlador.closeWindows());
                               
                               Stage myStage = (Stage) this.BotonIngrese.getScene().getWindow();
                               myStage.close();
                               
                           }

                       }else{
                           //EL USUARIO NO EXISTE
                             Alert alert= new Alert(Alert.AlertType.NONE);
                            alert.setTitle("ERROR!!");
                            alert.setContentText("LA CONTRASEÑA ES INCORRECTA");
                            alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/UsuarioNoEncontrado.png").toString()));
                            alert.setHeaderText("UPS! PARECE QUE HAY PROBLEMAS EN LA BASE DE DATOS...");
                            alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                            alert.showAndWait();
                       }
                 
                   }else{
                       //EL USUARIO NO EXISTE unu
                       Alert alert= new Alert(Alert.AlertType.NONE);
                        alert.setTitle("ERROR!!");
                        alert.setContentText("EL USUARIO NO EXISTE EN LA BASE DE DATOS");
                        alert.setGraphic(new ImageView(this.getClass().getResource("/imagenes/UsuarioNoEncontrado.png").toString()));
                        alert.setHeaderText("UPS! PARECE QUE HAY PROBLEMAS EN LA BASE DE DATOS...");
                        alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
                        alert.showAndWait();
                       
                   }
                   
                   
                   
               } catch (SQLException ex) {
                   System.out.print(ex.toString());
               }
               */
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

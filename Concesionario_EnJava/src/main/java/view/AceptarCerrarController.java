package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AceptarCerrarController {

    @FXML
    private Button aceptarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    void aceptarCerrar(ActionEvent event) throws IOException {
        FXMLLoader login= new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root=login.load();
        LoginController controller= login.getController();
        Scene loginScene=new Scene(root);
        Stage stage= new Stage();
        stage.setScene(loginScene);
        stage.show();
    }

    @FXML
    void cancelarCerrar(ActionEvent event) {



    }


}

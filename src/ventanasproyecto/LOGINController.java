/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 53752269g
 */
public class LOGINController implements Initializable {

    @FXML
    private Button btEntrar;
    @FXML
    private Button btRegistrarse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entrarAplicacion(ActionEvent event) {
       Parent root;

        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ventanasproyecto/LOGUEADO.fxml"));
            root = loader.load();
            
          
            LOGUEADOController datosLogin = loader.getController();

            Stage escenario = new Stage();
            escenario.setTitle("Ventana de elección");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();

          
           
            
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void registrarse(ActionEvent event) {
            Parent root;

        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ventanasproyecto/FORMULARIO.fxml"));
            root = loader.load();
            
          
            FORMULARIOController datosLogin = loader.getController();

            Stage escenario = new Stage();
            escenario.setTitle("Ventana de Registro");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();

          
           
            
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }
    
}

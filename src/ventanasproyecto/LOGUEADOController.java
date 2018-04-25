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
public class LOGUEADOController implements Initializable {

    @FXML
    private Button btPaquetesContratado;
    @FXML
    private Button btPaquetes;
    @FXML
    private Button btCalendario;
    @FXML
    private Button btPerfil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void paquetesContratados(ActionEvent event) {
        Parent root;

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ventanasproyecto/PAQUETESCONTRATADOS.fxml"));
            root = loader.load();

            PAQUETESCONTRATADOSController datosLogin = loader.getController();

            Stage escenario = new Stage();
            escenario.setTitle("Ventana de vista de paquetes contratados");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();

        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void mostrarPaquetes(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ventanasproyecto/CREARPAQUETES.fxml"));
            root = loader.load();
            CREARPAQUETESController datosLogin = loader.getController();
            Stage escenario = new Stage();
            escenario.setTitle("Ventana de crear paquetes contratados");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void mostrarCalendario(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ventanasproyecto/CALENDARIO.fxml"));
            root = loader.load();
            CALENDARIOController datosLogin = loader.getController();
            Stage escenario = new Stage();
            escenario.setTitle("Ventana de eventos");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void mostrarPerfil(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/ventanasproyecto/PERFIL.fxml"));
            root = loader.load();
            PERFILController datosLogin = loader.getController();
            Stage escenario = new Stage();
            escenario.setTitle("Ventana de vista de paquetes contratados");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

}

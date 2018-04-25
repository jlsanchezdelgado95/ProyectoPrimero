/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanasproyecto;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author 53752269g
 */
public class CALENDARIOController implements Initializable {

    @FXML
    private ListView<String> lvEventos;
    private ObservableList<String> eventos = FXCollections.observableArrayList();
    @FXML
    private DatePicker date;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void cargarDatos() {
        String evento;
        for (int i = 1; i <= 20; i++) {
            evento = "nombre evento" + i + "    " + "Direccion: " + "          " + "Descripción: ";
            eventos.add(evento);

        }
        lvEventos.setItems(eventos);

    }

    @FXML
    private void seleccionCalendario(ActionEvent event) {
        LocalDate dateHoy = LocalDate.now();
        
        if(dateHoy.equals(date.getValue())){
        cargarDatos();
        
        }else{
        
        lvEventos.getItems().clear();
        }
    }

}

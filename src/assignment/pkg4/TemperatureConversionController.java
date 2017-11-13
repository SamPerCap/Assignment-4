package assignment.pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Samuel
 */
public class TemperatureConversionController implements Initializable {

    @FXML
    private ComboBox<String> comboConversion;
    @FXML
    public TextField inputField;
    @FXML
    private TextField resultField;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //ComboBox<String> observableArrayList = this.comboConversion;
        combobox();
        
        
    }   
    @FXML
    public void combobox(){
        
        comboConversion.setItems(FXCollections.observableArrayList
        ("Celcius to Fahrenheit", "Fahrenheit to Celcius"));
        comboConversion.setVisibleRowCount(2);
        
    }
    
    @FXML
    public void handleSelectComboBox(ActionEvent event)
    {
        double inputTemp = Double.parseDouble(inputField.getText());
        double tempValue = 0;
   
        int selectedIndex = comboConversion.getSelectionModel().getSelectedIndex();
        
        String x = inputField.getText();
        switch (selectedIndex)
        {
            case 0:
                tempValue = TemperatureConversionModel.getTemperatureInFahrenheit(inputTemp);
                break;
            case 1:
                tempValue = TemperatureConversionModel.getTemperatureInCelcius(inputTemp);
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");      
        }
 
        String resultText = String.valueOf(tempValue);
        resultField.setText(resultText);
    }
}

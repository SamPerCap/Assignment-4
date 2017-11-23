/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4.BodyMassIndex;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Samuel
 */
public class BMIController implements Initializable {

    @FXML
    private Button buttonCalculate;
    @FXML
    private TextField wInput;
    @FXML
    private TextField hInput;
    @FXML
    private Label labelBMI;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickCalcualteBMI(ActionEvent event) {
        double inputWeight = Double.parseDouble(wInput.getText());
        double inputHeight = Double.parseDouble(hInput.getText());
        String x = wInput.getText();
        String y = hInput.getText();
        double BMIvalue = 0;
        
        BMIvalue = BMIModel.getBMI(inputWeight, inputHeight);
        
        String resultText = String.valueOf(BMIvalue);
        labelBMI.setText(resultText);
        
        
        
    }
    
}

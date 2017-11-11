/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author Samuel
 */
public class NumberConversionController implements Initializable {
    
 
    private NumberConversionModel ncmodel = new NumberConversionModel();
    @FXML
    private Label label1;
    @FXML
    private TextField txtNumberInput;
    @FXML
    private Label lblResult;
    @FXML
    private Button btnCalcKmToMiles;
    @FXML
    private Button btnCalcMilesToKm;
    
    public NumberConversionController()
    {
        ncmodel = new NumberConversionModel();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TextInputDialog dialog = new TextInputDialog("");
        
        dialog.setTitle("Text Input Dialog");
        
        dialog.setContentText("Please enter your name:");
        
        Optional<String> result = dialog.showAndWait();
        
            if(result.isPresent()){
            String message = ncmodel.getGreetingsMessage(result.get());
            
            label1.setText(message);
            
            }
        
        
    } 
   @FXML
    private void handleButtonAction(ActionEvent event){
        
     Button source = (Button) event.getSource();
        String resultAsString = "N/A";
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double result = 0;
        if (source == btnCalcMilesToKm)
        {
            result = ncmodel.getMilesFromKilometers(txtFieldValue);

        } else if (source == btnCalcKmToMiles)
        {
            result = ncmodel.getKilometersFromMiles(txtFieldValue);
        }
        resultAsString = String.format("%.3f", result);
        lblResult.setText(resultAsString);
    }
    
}

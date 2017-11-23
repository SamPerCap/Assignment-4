package assignment.pkg4.TemperatureConversion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class TemperatureConversionModel {
     
        
     
    public static double getTemperatureInFahrenheit (double x){
        
        
        
        return( x*9/5+32);
    }
    
    public static double getTemperatureInCelcius(double x){
        
        return((x-32)*5/9);
    }
    
    
}

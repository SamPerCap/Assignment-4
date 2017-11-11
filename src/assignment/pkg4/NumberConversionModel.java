/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

/**
 *
 * @author Samuel
 */
public class NumberConversionModel {
    
    private static final double MILE_TO_KM = 1.609344;
    
    public String getGreetingsMessage(String name){
    
    return "Hello, "+name+". Greetings from the top Java developer class in town.";
    
    }
    public double getMilesFromKilometers(double km){
        
        
        return (km / MILE_TO_KM);
    }
    
    public double getKilometersFromMiles(double miles){
        
        return (miles * MILE_TO_KM);
    }
    
    
}

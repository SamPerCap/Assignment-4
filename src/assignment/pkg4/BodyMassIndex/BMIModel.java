/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4.BodyMassIndex;

/**
 *
 * @author Samuel
 */
public class BMIModel {
    
    
    public static double getBMI(double x, double y){
    
    return(Math.round(x/(y*y)));
    }
    
    
}

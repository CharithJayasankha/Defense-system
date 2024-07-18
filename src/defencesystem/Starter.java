/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

import windows.Helicopter;
import windows.MainController;
import windows.Submarine;
import windows.Tank;

/**
 *
 * @author 94705
 */
public class Starter {
    public static MainController mainController;
    
    public static void main(String[] args) {
        mainController = new MainController();
        
        mainController.addToList(new Helicopter());       
        mainController.addToList(new Tank());       
        mainController.addToList(new Submarine());
        
    }
    
}

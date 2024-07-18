/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import enums.Strength;

/**
 *
 * @author 94705
 */
public interface Obsever {
    void sendAreaClearedMsg(boolean value);
    void enableOptions(Strength strength);
    void sendMessages(String message);
    
}

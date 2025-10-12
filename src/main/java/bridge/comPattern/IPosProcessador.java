/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bridge.comPattern;

import java.io.IOException;

/**
 *
 * @author olgac
 */
public interface IPosProcessador  {
    byte[] processar(byte[] bytes) throws IOException; 
}

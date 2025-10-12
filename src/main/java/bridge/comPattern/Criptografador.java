/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.comPattern;

import java.io.IOException;

/**
 *
 * @author olgac
 */
public class Criptografador implements IPosProcessador {

    private final int delay;

    public Criptografador(int delay) {
        this.delay = delay;
    }
    
    @Override
    public byte[] processar(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        for(int i=0; i<bytes.length; i++){
            newBytes[i] = (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
    
}

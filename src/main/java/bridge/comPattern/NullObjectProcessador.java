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
/// implementando um padrão caso não seja instanciado nenhum pós processador
/// utilizadando o padrão Null Object
public class NullObjectProcessador  implements IPosProcessador{

    @Override
    public byte[] processar(byte[] bytes) throws IOException {
        return bytes;
    }
    
}

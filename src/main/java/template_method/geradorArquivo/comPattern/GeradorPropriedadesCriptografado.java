/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.geradorArquivo.comPattern;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @author olgac
 */
public class GeradorPropriedadesCriptografado extends GeradorArquivo {

    private final int delay;
    public GeradorPropriedadesCriptografado(int delay) {
        this.delay = delay;
    }
    
    @Override
    protected byte[] processar(byte[] bytes) throws IOException {
        
        byte[] newBytes = new byte[bytes.length];
        for(int i=0; i<bytes.length; i++){
            newBytes[i] = (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }


    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        for (String prop: propriedades.keySet()){
            propFileBuilder
                    .append(prop)
                    .append("=")
                    .append(propriedades.get(prop))
                    .append("\n");
        }
        return propFileBuilder.toString();
    }
}

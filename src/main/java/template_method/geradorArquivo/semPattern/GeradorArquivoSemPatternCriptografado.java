/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.geradorArquivo.semPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author olgac
 */
public class GeradorArquivoSemPatternCriptografado {
    private final int delay;

    public GeradorArquivoSemPatternCriptografado(int delay) {
        this.delay = delay;
    }
    
    public void gerarRelatorio(String nome, Map<String, Object> propriedades)throws IOException{
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = processar(bytes );
        FileOutputStream fileOut = new FileOutputStream(nome);
        fileOut.write(bytes);
        fileOut.close();
                
    }
    
    protected byte[] processar(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        for(int i=0; i<bytes.length; i++){
            newBytes[i] = (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }


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

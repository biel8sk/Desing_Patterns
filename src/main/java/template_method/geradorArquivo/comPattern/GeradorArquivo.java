/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.geradorArquivo.comPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author olgac
 */
public abstract class GeradorArquivo {
    
    public final void gerarRelatorio(String nome, Map<String, Object> propriedades)throws IOException{
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = processar(bytes);
        FileOutputStream fileOut = new FileOutputStream(nome);
        fileOut.write(bytes);
        fileOut.close();
                
    }
    
    protected byte[] processar(byte[] bytes) throws IOException{
        return bytes;
    }
    
    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}

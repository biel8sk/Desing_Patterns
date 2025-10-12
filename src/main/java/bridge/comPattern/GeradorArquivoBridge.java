/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.comPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author olgac
 */
public abstract class GeradorArquivoBridge {
    // definindo processador padrão para caso não seja instanciado nenhum objeto
    private IPosProcessador processador = new NullObjectProcessador();
    
    public void setProcessador(IPosProcessador posProcessador){
        this.processador = posProcessador;
    }
    
    public final void gerarRelatorio(String nome, Map<String, Object> propriedades)throws IOException{
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = processador.processar(bytes);
        FileOutputStream fileOut = new FileOutputStream(nome);
        fileOut.write(bytes);
        fileOut.close();           
    }
    
    protected abstract String gerarConteudo(Map<String, Object> propriedades);
        
}

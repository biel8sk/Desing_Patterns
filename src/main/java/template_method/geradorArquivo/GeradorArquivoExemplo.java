/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.geradorArquivo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import template_method.geradorArquivo.comPattern.GeradorArquivo;
import template_method.geradorArquivo.comPattern.GeradorPropriedadesCriptografado;
import template_method.geradorArquivo.comPattern.GeradorXMLCompactado;

/**
 *
 * @author olgac
 */
public class GeradorArquivoExemplo {
    public static void main(String[] args) {
        GeradorArquivo gerador;
        Map<String, Object> propriedades = new HashMap<>();
        propriedades.put("spring","3.1");
        propriedades.put("versao", "21");
        
        //gerador = new GeradorPropriedadesCriptografado(1);
        gerador = new GeradorXMLCompactado();
        
        try{
            gerador.gerarRelatorio("Relatorio Compactado", propriedades);
        }catch (IOException e) {
            System.out.println("Erro ao pegar criar o relatório");
        }
    }
}

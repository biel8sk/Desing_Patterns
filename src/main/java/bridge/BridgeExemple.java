/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

import bridge.comPattern.GeradorXML;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author olgac
 */
public class BridgeExemple {
    public static void main(String[] args){
        Map<String, Object> properties = new HashMap<>();
        properties.put("nome", "Gabriel");
        properties.put("idade", "20");
        properties.put("profissao", "Estudante");
        // gerando xml normal 
        GeradorXML gerador = new GeradorXML();
        try{
            gerador.gerarRelatorio("Relatorio-Sem-Processador.xml", properties);
        } catch (IOException e){
            System.out.println("Erro ao gerar relatório: "+e.toString());
        }
    }
}

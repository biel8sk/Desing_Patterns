/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.comPattern;

import java.util.Map;

/**
 *
 * @author olgac
 */
public class GeradorXML extends GeradorArquivoBridge {

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        propFileBuilder.append("<properties>");
        for (String prop: propriedades.keySet()){
            propFileBuilder
                    .append("<").append(prop).append(">")
                    .append(propriedades.get(prop))
                    .append("</").append(prop).append(">");
        }
        propFileBuilder.append("</properties>");
        return propFileBuilder.toString();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.geradorArquivo.comPattern;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author olgac
 */
public class GeradorXMLCompactado extends GeradorArquivo {
    
    @Override
    protected byte[] processar(byte[] bytes) throws IOException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ZipOutputStream out = new ZipOutputStream(byteOut);
        out.putNextEntry(new ZipEntry("internal"));
        out.write(bytes);
        out.closeEntry();
        out.close();
        return byteOut.toByteArray();
    }

    @Override
    protected String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        propFileBuilder.append("<properties>");
        for (String prop: propriedades.keySet()){
            propFileBuilder.append("<"+prop+">"+propriedades.get(prop)+"</"+prop+">");
        }
        propFileBuilder.append("</properties>");
        return propFileBuilder.toString();
    }    
}

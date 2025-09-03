/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.logger.semPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 *
 * @author olgac
 */
public class LoggerManeger {
    private PrintWriter writer;
    
    public LoggerManeger() {
        try {
            // Abre o arquivo de log em modo de append (acrescentar)
            FileWriter fw = new FileWriter("application.log", true);
            writer = new PrintWriter(fw, true);
            System.out.println("Nova instancia criada");
        } catch (IOException e) {
            System.err.println("Erro ao abrir o arquivo de log: " + e.getMessage());
        }
    }
    
    public void log(String message) {
        writer.println(LocalDateTime.now() + " : " + message);
    }
}

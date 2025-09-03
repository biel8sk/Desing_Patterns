/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.logger.comPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 *
 * @author olgac
 */
public class LoggerManegerSingleton {
    //variável estática pra armazenar a instância
    private static LoggerManegerSingleton instance;
    private PrintWriter writer;
    
    //construtor privado
    private LoggerManegerSingleton() {
        try {
            // Abre o arquivo de log em modo de append (acrescentar)
            FileWriter fw = new FileWriter("application_singleton.log", true);
            writer = new PrintWriter(fw, true);
            System.out.println("Singleton inicializado");
        } catch (IOException e) {
            System.err.println("Erro ao abrir o arquivo de log: " + e.getMessage());
        }
    }
    
    //método estático público para pegar a instância
    public static synchronized LoggerManegerSingleton getInstance(){
        if (instance == null){
            instance = new LoggerManegerSingleton();
        }
        return instance;
    }
    
    public void log(String message) {
        writer.println(LocalDateTime.now() + " : " + message);
    }

    // impossibilitando o clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.logger.semPattern;

/**
 *
 * @author olgac
 */
public class ConcurrentLoggerWithoutSingleton {
    public static void main(String[] args ){
        Runnable task = () -> {
            LoggerManeger logger = new LoggerManeger();
            for (int i = 0; i < 5; i++){
                // printando o logger a thread atual
                logger.log("Mensagem na thread :" + Thread.currentThread().getName() + " - " + i);
            }
        };
        
        // criando threads 
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        
        th1.start();
        th2.start();
         
        // Problema: várias threads criando suas próprias instâncias de Logger, o que pode levar a:
        // - Sobrecarga na abertura do arquivo
        // - Escritas concorrentes não sincronizadas no mesmo arquivo, podendo corrompê-lo ou misturar as linhas
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.logger.comPattern;

/**
 *
 * @author olgac
 */
public class ConcurrentLoggerWithSingleton {
    public static void main(String[] args) {
        Runnable task = () -> {
            LoggerManegerSingleton logger = LoggerManegerSingleton.getInstance();
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
         
        // apenas uma instancia escrevendo no arquivo
        
        
    }
}

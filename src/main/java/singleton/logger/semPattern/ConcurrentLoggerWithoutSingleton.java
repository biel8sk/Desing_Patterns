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
    public static void main(String[] args ) throws InterruptedException{
        System.out.println("Testando concorrência SEM Singleton");

        Runnable task1 = () -> {
            LoggerManeger logger = new LoggerManeger();
            for (int i = 0; i < 5; i++){
                // printando o logger a thread atual
                logger.log("Mensagem na thread :" + Thread.currentThread().getName() + " - " + i);
                
                try {
                    Thread.sleep(100); // Pequena pausa para simular processamento
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
            logger.log("Termminando tarefa 1 \n");
        };
        Runnable task2 = () -> {
            LoggerManeger logger = new LoggerManeger();
            for (int i = 0; i < 5; i++){
                // printando o logger a thread atual
                logger.log("Mensagem na thread :" + Thread.currentThread().getName() + " - " + i);
                
                try {
                    Thread.sleep(85); // Pequena pausa para simular processamento
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
            logger.log("Termminando tarefa 2 \n");
        };
        
        // criando threads 
        Thread th1 = new Thread(task1, "Th1");
        Thread th2 = new Thread(task2, "TH2");
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println("Teste de concorrência sem Singleton concluído. Verifique o arquivo application.log");
         
        // Problema: várias threads criando suas próprias instâncias de Logger, o que pode levar a:
        // - Sobrecarga na abertura do arquivo
        // - Escritas concorrentes não sincronizadas no mesmo arquivo, podendo corrompê-lo ou misturar as linhas
        
        
    }
}

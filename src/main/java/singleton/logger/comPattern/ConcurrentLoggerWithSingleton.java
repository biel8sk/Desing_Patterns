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
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Testando concorrência COM Singleton");
        Runnable task = () -> {
            LoggerManegerSingleton logger = LoggerManegerSingleton.getInstance();
            for (int i = 0; i < 5; i++){
                // printando o logger a thread atual
                logger.log("Mensagem na thread :" + Thread.currentThread().getName() + " - " + i);
                
                 try {
                    Thread.sleep(100); // Pequena pausa para simular processamento
                } catch (InterruptedException e) {
                     System.out.println("Erro " + e.toString());
                }
            }
        };
        
        // criando threads 
        Thread th1 = new Thread(task, "TH1");
        Thread th2 = new Thread(task, "TH2");
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
         
        // apenas uma instancia escrevendo no arquivo
        System.out.println("Teste de concorrência com Singleton concluído. Verifique o arquivo application_singleton.log");
        
    }
}

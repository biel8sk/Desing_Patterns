/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import singleton.logger.comPattern.ApplicationWithSingleton;
import singleton.logger.comPattern.ConcurrentLoggerWithSingleton;
import singleton.logger.semPattern.ApplicationWithoutSingleton;
import singleton.logger.semPattern.ConcurrentLoggerWithoutSingleton;


/**
 *
 * @author olgac
 */
public class SingletonExemploMain {
    public static void main(String[] args) throws InterruptedException {
        ApplicationWithoutSingleton.main(args);
        ApplicationWithSingleton.main(args);
        System.out.println("\n");
        System.out.println("Testando concorrencia");
        ConcurrentLoggerWithoutSingleton.main(args);
        ConcurrentLoggerWithSingleton.main(args);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.logger.comPattern;

/**
 *
 * @author olgac
 */
public class ApplicationWithSingleton {
    public static void main(String[] args) {
        // Todos os módulos usam a mesma instância do Logger
        LoggerManegerSingleton authLogger = LoggerManegerSingleton.getInstance();
        authLogger.log("Usuário tentou logar.");
        
        LoggerManegerSingleton dbLogger = LoggerManegerSingleton.getInstance();
        dbLogger.log("Consulta ao banco de dados realizada.");
        
        LoggerManegerSingleton uiLogger = LoggerManegerSingleton.getInstance();
        uiLogger.log("Botão clicado na interface.");
        
        // Verificando se são a mesma instância
        System.out.println("authLogger é a mesma instância que dbLogger? " + (authLogger == dbLogger));
        // Resultado: true
    }
}

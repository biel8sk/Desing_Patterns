/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.logger.semPattern;

/**
 *
 * @author olgac
 */
public class ApplicationWithoutSingleton {
    public static void main(String[] args) {
        // Módulo de autenticação cria seu próprio logger
        LoggerManeger authLogger = new LoggerManeger();
        authLogger.log("Usuário tentou logar.");
        
        // Módulo de banco de dados cria seu próprio logger
        LoggerManeger dbLogger = new LoggerManeger();
        dbLogger.log("Consulta ao banco de dados realizada.");
        
        // Módulo de UI também cria seu próprio logger
        LoggerManeger uiLogger = new LoggerManeger();
        uiLogger.log("Botão clicado na interface.");
        
        // Problema: múltiplas instâncias com múltiplos FileWriters para o mesmo arquivo
        // Isso pode causar conflito de escrita e sobrecarga de I/O.
        
        // Além disso, se quisermos mudar o nível de log ou o arquivo de log, teríamos que fazer em cada instância.
    }
}

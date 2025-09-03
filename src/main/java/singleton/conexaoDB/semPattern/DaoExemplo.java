package singleton.conexaoDB.semPattern;

import singleton.conexaoDB.semPattern.ConexaoDB;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olgac
 */
public class DaoExemplo {
    private final Connection c;

    public DaoExemplo() {
        this.c = ConexaoDB.getConexaoMySQL();
    }
    
    public void create(){
        System.out.println("Dados inseridos no banco"); 
    }
    
    public void delet() {
        System.out.println("Dados deletados do banco");
    }
    
    
}

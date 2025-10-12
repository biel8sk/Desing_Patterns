/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.menu.comPattern;

import javax.swing.JOptionPane;

/**
 *
 * @author olgac
 */
public class MenuComPattern extends MenuBase {

    @Override
    public void inserir() {
        System.out.println("Inserindo dados");
    }

    @Override
    public void listar() {
        System.out.println("Listando dados");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo os dados");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando os dados");
    }

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

abstract class MenuBase {
    
    final public void listarOpcoes(){
         String msg = " 1 - Inserir \n 2 - Alterar \n 3 - buscar \n 4 - excluir \n 5 - Listar " ;
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 1 : 
                inserir();
                break;
            case 2 : 
                alterar();
                break;
            case 3 : 
                buscar();
                break;
            case 4 : 
                excluir();
                break;
            case 5 : 
                listar();
                break;
            default : 
                System.out.println("Opcao inválida");
                break;
        }
    }
    
    abstract public void inserir();
    abstract public void listar();
    abstract public void excluir();
    abstract public void buscar();
    abstract public void alterar();
}




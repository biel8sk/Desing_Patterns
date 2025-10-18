/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.calculoEstacionamento;

/**
 *
 * @author olgac
 */
public class ContaEstacionamento {
    private ICalculoStrategy strategy;
    private Veiculo veiculo;
    private long periodoInicio;
    private long periodoFim;
    
    public double valorConta(){
        return strategy.calcular(periodoFim-periodoInicio, veiculo);
    }
    
    public void setCalculo(ICalculoStrategy newStrategy){
        this.strategy = newStrategy;
    }
}   

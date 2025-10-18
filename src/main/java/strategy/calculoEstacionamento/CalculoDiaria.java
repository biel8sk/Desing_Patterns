/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.calculoEstacionamento;

/**
 *
 * @author olgac
 */
public class CalculoDiaria implements ICalculoStrategy {

    public CalculoDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    private double valorDiaria;
    
    @Override
    public double calcular(double periodo, Veiculo veiculo) {
        return periodo * valorDiaria;
    }
    
}

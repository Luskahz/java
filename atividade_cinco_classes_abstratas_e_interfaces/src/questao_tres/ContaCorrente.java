    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_tres;

/**
 *
 * @author lucas
 */
public final class ContaCorrente extends Conta implements Tributavel {
    double tributo = calculaTributos();
    
    public ContaCorrente(double valor) {
        super(valor);
    }
    

    @Override
    public double calculaTributos() {
        double saldo = obterSaldo();
        return saldo * 0.01;
    }
    
    public void mostrarTributo() {
        System.out.println("O tributo calculado para esta conta é: R$ " + calculaTributos());
    }
    
}

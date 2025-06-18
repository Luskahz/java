/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_tres;

/**
 *
 * @author lucas
 */
public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    

    
    public void sacar(double valor) throws SaldoException{
        if(valor > this.saldo){
            throw new SaldoException();
        }
        this.saldo -= valor;
        System.out.println(valor + " Sacado da conta, total em conta:" + this.saldo);
        
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println(valor + " Depositado na conta, total em conta:" + this.saldo);
        
    }
    
    
}

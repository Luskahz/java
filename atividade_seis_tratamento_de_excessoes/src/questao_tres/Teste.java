/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_tres;

/**
 *
 * @author lucas
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        try{
            conta.sacar(1001);
        } catch(SaldoException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}

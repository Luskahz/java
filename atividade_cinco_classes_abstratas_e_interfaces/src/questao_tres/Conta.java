

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

    public double obterSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public void sacar(double valor){ 
        setSaldo(obterSaldo() - valor);
        System.out.println("sacado "+ valor +" valor atual na conta: " + obterSaldo());
    }
    public void depositar(double valor){
        setSaldo(obterSaldo() + valor);
        System.out.println("depositado "+ valor +" valor atual na conta: " + obterSaldo());
    }
    
    
}

package questao_tres;

public class testaTributavel {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0);
        SeguroDeVida seguro = new SeguroDeVida();
        
        contaCorrente.depositar(500.0);  // Depositando R$ 500
        contaCorrente.sacar(200.0);      // Sacando R$ 200
        

        contaCorrente.mostrarTributo();  
        
        System.out.println("Saldo da Conta Corrente: R$ " + contaCorrente.obterSaldo());
        System.out.println("Saldo da Conta Poupança: R$ " + contaPoupanca.obterSaldo());
        
        System.out.println("Conta Poupança não tem tributo. Saldo: R$ " + contaPoupanca.obterSaldo());
        System.out.println("seguro de vida tem um tributo" + seguro.calculaTributos());
    }
}

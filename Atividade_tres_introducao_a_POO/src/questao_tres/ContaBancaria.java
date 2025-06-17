package questao_tres;

import java.io.IOException;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private ContaExtrato extrato;

    public ContaBancaria(String numeroConta, double saldoInicial, String caminho) throws Exception {
        ContaExtrato registros = new ContaExtrato(caminho, numeroConta);
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.extrato = registros;
    }

    public void saque(double valor) throws SaldoInsuficienteException, Exception{
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque do valor:" + valor);
        }
        extrato.addSaque(valor, saldo);
    }

    public void deposito(double valor) throws Exception {
        saldo += valor;
        extrato.addDeposito(valor, saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void extrato() throws IOException{
        extrato.showExtrato();
    }
}

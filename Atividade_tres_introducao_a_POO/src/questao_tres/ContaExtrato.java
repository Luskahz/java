/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_tres;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class ContaExtrato {
    private final String caminho;
    private final String conta;
    
    
    public ContaExtrato(String caminho, String conta) throws Exception {
        this.caminho = caminho;
        this.conta = conta;
        try(FileOutputStream extrato = new FileOutputStream(caminho, true)){
            DataOutputStream dos = new DataOutputStream(extrato);
            dos.writeUTF("Extrato referente a conta de numero: ");
            dos.writeUTF(conta);
            dos.writeUTF("#\n");
        }
    }
    
    
    public void addSaque(double valorSaque, double saldo) throws Exception {
        double newSaldo = saldo - valorSaque;
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(caminho, true))){
            dos.writeUTF("-");
            dos.writeDouble(valorSaque);
            dos.writeUTF(" from ");
            dos.writeDouble(saldo);
            dos.writeUTF(" == ");
            dos.writeDouble(newSaldo);
            dos.writeUTF("\n");
        }
    }
    public void addDeposito(double valorDep, double saldo) throws Exception {
        double newSaldo = saldo + valorDep;
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(caminho, true))){
            dos.writeUTF("+");
            dos.writeDouble(valorDep);
            dos.writeUTF(" from ");
            dos.writeDouble(saldo);
            dos.writeUTF(" == ");
            dos.writeDouble(newSaldo);
            dos.writeUTF("\n");
        }
    }
    
    public void showExtrato() throws FileNotFoundException, IOException {
      try(DataInputStream dis = new DataInputStream(new FileInputStream(caminho))){
          String cabecalho = dis.readUTF();
          String conta = dis.readUTF();
          String sep = dis.readUTF();
          
          System.out.println(cabecalho + conta + sep);
          while(true){
              String operacao       = dis.readUTF();
              double valorOperado   = dis.readDouble();
              String from           = dis.readUTF();
              double saldo          = dis.readDouble();
              String indicador      = dis.readUTF();
              double newSaldo       = dis.readDouble();
              String separacao      = dis.readUTF();
              System.out.println(operacao + valorOperado + from + saldo + indicador + newSaldo + separacao);
          } 

          
          } catch (EOFException e){
              
              
          } catch (IOException e){
              System.out.println("erro na leitura: "+ e.getMessage());
          }
      }
      
    
    }

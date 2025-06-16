package questao_dois;

import java.io.IOException;

public class Main_dois{
    public static void main(String[] args) {
        try{
            Funcionario f = new Funcionario("João Silva", "TI", 3500.00, "15/03/2020", "12345678");
            BancoFuncionarios bf = new BancoFuncionarios("C:\\Users\\lucas\\OneDrive\\Documentos\\NetBeansProjects\\Atividade_tres_introducao_a_POO\\src\\questao_dois\\banco.txt");
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: R$" + f.getSalario());
            f.recebeAumento(500.00);
            System.out.println("Novo salário após aumento: R$" + f.getSalario());
            System.out.println("Ganho anual: R$" + f.calculaGanhoAnual());
            
            bf.salvarFuncionario(f);
        } catch(IOException e){
            System.out.println("erro gerado ao salvar o funcionario: " + e.getMessage());
        }
}
}

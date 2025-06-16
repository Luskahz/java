package questao_um;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main_um {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("20231001", "Ana Clara", 7.5, 6.8, 9.0);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Média: " + aluno.media());
        System.out.println("Nota necessária na recuperação: " + aluno.rec());
        try {
            aluno.SalvarAluno("C:\\Users\\lucas\\OneDrive\\Documentos\\NetBeansProjects\\Atividade_tres_introducao_a_POO\\src\\questao_um\\banco_dados\\banco_alunos.txt");
        } catch (IOException e) {
            System.out.println("erro para tratativa: " + e.getMessage());
        }
            
        }
}

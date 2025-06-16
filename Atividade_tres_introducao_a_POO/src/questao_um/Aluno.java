package questao_um;

import java.io.*;


public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    public Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return (nota1 * 2.5 + nota2 * 2.5 + notaTrabalho * 2) / 7;
    }
    public double rec() {
        double m = media();
        if (m >= 6.0) {
            return 0.0;
        } else {
            return (6.0 * 2) - m;
        }
    }
    public void SalvarAluno(String caminho) throws IOException{
            
            File aluno = new File(caminho);
            FileWriter writer = new FileWriter(aluno, true);
            writer.write(
                    "\n\n"+ 
                    "Matricula: " + getMatricula() +
                    "\nNome:" + getNome() +
                    "\nNota 1: " + getNota1()+
                    "\nNota 2: "+ getNota2()+
                    "\nNota Trabalho: "+ getNotaTrabalho()+ 
                    "\nNota que precisa para passar: " + rec()
                    +"\n\n#"
            );
            writer.close();
    }

    public String getMatricula() {
        return matricula;
    }
    public double getNota2() {
        return nota2;
    }
    public String getNome() {
        return nome;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}


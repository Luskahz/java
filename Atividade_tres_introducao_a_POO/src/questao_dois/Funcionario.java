package questao_dois;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double getSalario() {
        return salario;
    }
    public String getDataEntrada() {
        return dataEntrada;
    }
    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }


    public void recebeAumento(double valor) {
        salario += valor;
    }
    public double calculaGanhoAnual() {
        return salario * 12;
    }


}

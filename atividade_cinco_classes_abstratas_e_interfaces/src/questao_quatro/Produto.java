/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_quatro;

/**
 *
 * @author lucas
 */
public abstract class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    private double custoBeneficio;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void setCustoBeneficio(double custoBeneficio) {
        this.custoBeneficio = custoBeneficio;
    }
     public double getCustoBeneficio() {
        return this.custoBeneficio;
    }
    
    
    
    
    
    public int compareTo(Produto outroProduto){
        if(this.custoBeneficio < outroProduto.custoBeneficio){
            return -1;
        }else if(this.custoBeneficio > outroProduto.custoBeneficio){
            return 1;
        } else {
            return 0;
        }
    }
    
     

    
}

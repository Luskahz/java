/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_dois;

/**
 *
 * @author lucas
 */
public class ProdutoComprado implements IProduto {
    private String nome;
    private float custo;

    public ProdutoComprado(String nome, float custo) {
        this.nome = nome;
        this.custo = custo;
    }
    
    
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public float getCusto() {
       return custo;
    }
    
}

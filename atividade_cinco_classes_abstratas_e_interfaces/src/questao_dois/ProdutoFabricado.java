/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_dois;

/**
 *
 * @author lucas
 */
public class ProdutoFabricado implements IProdutoFabricado{
    private String nome;
    private IProduto[] ingredintes;
    private int quantidadeIngredientes;
    
    public ProdutoFabricado(String nome, int capacidadeMaximaIngredientes) {
        this.nome = nome;
        this.ingredintes = new IProduto[capacidadeMaximaIngredientes];
        this.quantidadeIngredientes = 0;
    }
    
    
    
    

    @Override
    public int getNumeroIngredientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IProduto GetIngrediente(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getCusto() {
        return 0;
    }

    
}

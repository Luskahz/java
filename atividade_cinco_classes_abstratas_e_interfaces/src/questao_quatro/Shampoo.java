/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_quatro;

/**
 *
 * @author lucas
 */
public class Shampoo extends Produto implements IProduto {
    private int irritabilidade;

    public Shampoo(int irritabilidade, String nome, double preco) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }
   
    @Override
    public void calculaCustoBeneficio() {
        super.setCustoBeneficio((double) (super.getPreco())/(irritabilidade));
    }

    

   
    
    
    
    
}

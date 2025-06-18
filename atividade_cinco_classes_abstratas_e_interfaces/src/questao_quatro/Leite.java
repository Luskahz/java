/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_quatro;

/**
 *
 * @author lucas
 */
public class Leite extends Produto implements IProduto  {
    private int durabilidade;

    public Leite(int durabilidade, String nome, double preco) {
        super(nome, preco);
        this.durabilidade = durabilidade;
    }

    @Override
    public void calculaCustoBeneficio() {
        super.setCustoBeneficio((float) (super.getPreco()*(durabilidade/100)));
    }
    
    

    
    
    
    
}

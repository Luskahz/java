/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_quatro;

/**
 *
 * @author lucas
 */
public class Biscoito extends Produto implements IProduto {
    private final int cC_formula;

    public Biscoito(int cC_formula, String nome, double preco) {
        super(nome, preco);
        this.cC_formula = cC_formula;
    }

    @Override
    public void calculaCustoBeneficio() {
        super.setCustoBeneficio((float) (super.getPreco()/cC_formula));
    }
    
    
}

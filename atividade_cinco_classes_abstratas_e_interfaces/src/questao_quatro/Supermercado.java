/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_quatro;

/**
 *
 * @author lucas
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shampoo[] sh = new Shampoo[2];
        Leite[] lt = new Leite[2];
        Biscoito[] bt = new Biscoito[2];
        System.out.println("arrays instanciados");
        sh[0] = new Shampoo(2,"Caralho1", 10.00);
        sh[1] = new Shampoo(3,"Caralho2", 10.00);
        lt[0] = new Leite(20,"Caralho3", 10.00);
        lt[1] = new Leite(100,"Caralho4", 10.00);
        bt[0] = new Biscoito(20,"Caralho5", 10.00);
        bt[1] = new Biscoito(100,"Caralho6", 10.00);
        
        sh[0].calculaCustoBeneficio();
        sh[1].calculaCustoBeneficio();
        lt[0].calculaCustoBeneficio();
        lt[1].calculaCustoBeneficio();
        bt[0].calculaCustoBeneficio();
        bt[1].calculaCustoBeneficio();
        
        for (Shampoo shampoo : sh) shampoo.calculaCustoBeneficio();
        for (Leite leite : lt) leite.calculaCustoBeneficio();
        for (Biscoito biscoito : bt) biscoito.calculaCustoBeneficio();
        

        // Imprimindo os valores do custo-benefício de cada produto
        System.out.println("Custo beneficio em sequencia: " +
            sh[0].getCustoBeneficio() + ", " + 
            sh[1].getCustoBeneficio() + ", " + 
            lt[0].getCustoBeneficio() + ", " + 
            lt[1].getCustoBeneficio() + ", " + 
            bt[0].getCustoBeneficio() + ", " + 
            bt[1].getCustoBeneficio());
            
        System.out.println(sh[0].compareTo(sh[1]));
        System.out.println(lt[0].compareTo(lt[1]));
        System.out.println(bt[0].compareTo(bt[1]));
    }
    
}

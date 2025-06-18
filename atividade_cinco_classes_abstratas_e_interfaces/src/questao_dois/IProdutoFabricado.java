/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_dois;


public interface IProdutoFabricado extends IProduto{
    int getNumeroIngredientes();
    IProduto GetIngrediente(int numero);
}

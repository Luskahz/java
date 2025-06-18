/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa_dois;

/**
 *
 * @author lucas
 */
public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo, int horas, int quantidadePortas) {
        super(placa, modelo, "Carro", horas);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularTaxa() {
        double valor = horasEstacionado * 10.0;
        return aplicarDesconto(valor);
    }
}


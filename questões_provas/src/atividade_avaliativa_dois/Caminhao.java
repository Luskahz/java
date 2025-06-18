/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa_dois;

/**
 *
 * @author lucas
 */
public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, int horas, double capacidadeCarga) {
        super(placa, modelo, "Caminhão", horas);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularTaxa() {
        double valor = horasEstacionado * 15.0;
        return aplicarDesconto(valor);
    }
}


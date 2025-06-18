/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa_dois;

/**
 *
 * @author lucas
 */
public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String placa, String modelo, int horas, int cilindrada) {
        super(placa, modelo, "Moto", horas);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularTaxa() {
        double valor = horasEstacionado * 5.0;
        return aplicarDesconto(valor);
    }
}


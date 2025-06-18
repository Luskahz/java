/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa_dois;

/**
 *
 * @author lucas
 */
public class Veiculo {
    protected String placa;
    protected String modelo;
    protected String tipo;
    protected int horasEstacionado;

    public Veiculo(String placa, String modelo, String tipo, int horasEstacionado) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.horasEstacionado = horasEstacionado;
    }

    public double calcularTaxa() {
        return 0; // será sobrescrito
    }

    public String getInfo() {
        return tipo + " | Placa: " + placa + " | Modelo: " + modelo + " | Horas: " + horasEstacionado + "h | Valor: R$ " + String.format("%.2f", calcularTaxa());
    }

    public double aplicarDesconto(double valor) {
        if (horasEstacionado > 12) return valor * 0.8;
        if (horasEstacionado > 6) return valor * 0.9;
        return valor;
    }
}

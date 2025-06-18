/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_avaliativa_dois;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        // Estacionamento com capacidade fixa de 5 vagas
        Estacionamento estacionamento = new Estacionamento(5);

        // Criando veículos
        Carro c1 = new Carro("ABC1234", "Gol", 5, 4);
        Moto m1 = new Moto("DEF5678", "CG 160", 7, 160);
        Caminhao cam1 = new Caminhao("GHI9999", "Volvo", 13, 25.0);

        // Adicionando veículos
        estacionamento.adicionarVeiculo(c1);
        estacionamento.adicionarVeiculo(m1);
        estacionamento.adicionarVeiculo(cam1);

        // Gerando relatório
        estacionamento.gerarRelatorioVeiculos();
        estacionamento.resumoFaturamento();

        // Removendo um veículo
        estacionamento.removerVeiculo("ABC1234");

        // Relatório após remoção
        estacionamento.gerarRelatorioVeiculos();
        estacionamento.resumoFaturamento();
    }
}



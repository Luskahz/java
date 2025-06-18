/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_avaliativa_dois;

/**
 *
 * @author lucas
 */
public class Estacionamento {
    private Veiculo[] vagas;
    private int limiteVagas;
    private int quantidadeVeiculos;

    public Estacionamento(int limiteVagas) {
        this.limiteVagas = limiteVagas;
        this.vagas = new Veiculo[limiteVagas];
        this.quantidadeVeiculos = 0;
    }

    public boolean adicionarVeiculo(Veiculo v) {
        if (quantidadeVeiculos >= limiteVagas) {
            System.out.println("Estacionamento cheio! Não há vagas disponíveis.");
            return false;
        }

        vagas[quantidadeVeiculos] = v;
        quantidadeVeiculos++;
        System.out.println("Veículo adicionado: " + v.placa);
        return true;
    }

    public boolean removerVeiculo(String placa) {
        for (int i = 0; i < quantidadeVeiculos; i++) {
            if (vagas[i].placa.equalsIgnoreCase(placa)) {
                // Remoção e deslocamento para manter o vetor compacto
                for (int j = i; j < quantidadeVeiculos - 1; j++) {
                    vagas[j] = vagas[j + 1];
                }
                vagas[quantidadeVeiculos - 1] = null; // limpa a última vaga
                quantidadeVeiculos--;
                System.out.println("Veículo removido: " + placa);
                return true;
            }
        }
        System.out.println("Veículo não encontrado.");
        return false;
    }

    public void gerarRelatorioVeiculos() {
        System.out.println("\n🚗 Relatório de Veículos Estacionados:");
        for (int i = 0; i < quantidadeVeiculos; i++) {
            System.out.println(vagas[i].getInfo());
        }
    }

    public void resumoFaturamento() {
        double total = 0;
        for (int i = 0; i < quantidadeVeiculos; i++) {
            total += vagas[i].calcularTaxa();
        }
        System.out.println("\n💰 Faturamento total: R$ " + String.format("%.2f", total));
    }
}


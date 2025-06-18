package atividade_avaliativa_um;

import java.util.Scanner;

public class exercicio_dois {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a hora de chegada: ");
        int horaChegada = sc.nextInt();
        System.out.print("Digite os minutos de chegada: ");
        int minutoChegada = sc.nextInt();

        System.out.print("Digite a hora de partida: ");
        int horaPartida = sc.nextInt();
        System.out.print("Digite os minutos de partida: ");
        int minutoPartida = sc.nextInt();

        // Cálculo da duração em minutos
        int totalMinutosChegada = horaChegada * 60 + minutoChegada;
        int totalMinutosPartida = horaPartida * 60 + minutoPartida;

        // Se a partida é no dia seguinte
        if (totalMinutosPartida < totalMinutosChegada) {
            totalMinutosPartida += 24 * 60; // Adiciona 24 horas em minutos
        }

        int duracaoMinutos = totalMinutosPartida - totalMinutosChegada;

        // Arredondar para cima para calcular as horas
        int horasAPagar = (duracaoMinutos + 59) / 60; // Arredondando para cima

        // Calcular o preço
        double preco = 0.0;

        if (horasAPagar >= 1 && horasAPagar <= 2) {
            preco = horasAPagar * 1.00;
        } else if (horasAPagar >= 3 && horasAPagar <= 4) {
            preco = 2 * 1.00 + (horasAPagar - 2) * 1.40;
        } else {
            preco = 2 * 1.00 + 2 * 1.40 + (horasAPagar - 4) * 2.00;
        }

        // Saída do resultado
        System.out.printf("Preço a pagar: R$ %.2f%n", preco);
    }
}

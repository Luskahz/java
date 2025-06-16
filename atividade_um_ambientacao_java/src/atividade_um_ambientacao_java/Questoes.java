package atividade_um_ambientacao_java;

import java.util.Scanner;

public class Questoes {

    // Exercício 1: Conversão de Fahrenheit para Celsius
    public static void conversaoTemperatura() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf("Temperatura em Celsius: %.2f%n", celsius);
    }

    // Exercício 2: Idade expressa em dias
    public static void idadeEmDias() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os anos: ");
        int anos = sc.nextInt();
        System.out.print("Digite os meses: ");
        int meses = sc.nextInt();
        System.out.print("Digite os dias: ");
        int dias = sc.nextInt();
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Idade expressa em dias: " + totalDias);
    }

    // Exercício 3: Divisão do prêmio da loteria
    public static void divisaoPremio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor total do prêmio: ");
        double premio = sc.nextDouble();
        System.out.printf("Sena: R$ %.2f%n", premio * 0.60);
        System.out.printf("Quina: R$ %.2f%n", premio * 0.30);
        System.out.printf("Quadra: R$ %.2f%n", premio * 0.10);
    }

    // Exercício 4: Cálculo de prestação com juros simples
    public static void calculoJuros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o capital inicial: ");
        double capital = sc.nextDouble();
        System.out.print("Digite a taxa de juros (em decimal, ex: 0.05 para 5%): ");
        double taxa = sc.nextDouble();
        System.out.print("Digite o tempo em meses: ");
        int tempo = sc.nextInt();
        double juros = capital * taxa * tempo;
        double prestacao = capital + juros;
        System.out.printf("Valor da prestação: R$ %.2f%n", prestacao);
    }

    // Exercício 5: Inversão de número de três dígitos
    public static void inverterNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 100 e 999: ");
        int numero = sc.nextInt();
        if (numero < 100 || numero > 999) {
            System.out.println("Número inválido! Deve estar entre 100 e 999.");
            return;
        }
        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;
        int numeroInvertido = (unidade * 100) + (dezena * 10) + centena;
        System.out.println("Número invertido: " + numeroInvertido);
    }

    // Exercício 6: Operações matemáticas com funções
    public static float adicao(float a, float b) {
        return a + b;
    }

    public static float subtracao(float a, float b) {
        return a - b;
    }

    public static float multiplicacao(float a, float b) {
        return a * b;
    }

    public static float divisao(float a, float b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static void operacoesMatematicas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = sc.nextFloat();

        System.out.printf("Soma: %.1f%n", adicao(num1, num2));
        System.out.printf("Subtração: %.1f%n", subtracao(num1, num2));
        System.out.printf("Multiplicação: %.1f%n", multiplicacao(num1, num2));
        System.out.printf("Divisão: %.1f%n", divisao(num1, num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Conversão de Fahrenheit para Celsius");
            System.out.println("2 - Idade em dias");
            System.out.println("3 - Divisão do prêmio da loteria");
            System.out.println("4 - Cálculo de prestação com juros simples");
            System.out.println("5 - Inversão de número de três dígitos");
            System.out.println("6 - Operações matemáticas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: conversaoTemperatura(); break;
                case 2: idadeEmDias(); break;
                case 3: divisaoPremio(); break;
                case 4: calculoJuros(); break;
                case 5: inverterNumero(); break;
                case 6: operacoesMatematicas(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
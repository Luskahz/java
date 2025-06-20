/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dois_estruturas_basicas;

/**
 *
 * @author lucas
 */
import java.util.*;

public class Questoes {

    // Funções auxiliares para o Exercício 1
    public static int quociente(int a, int b) {
        return a / b;
    }

    public static int resto(int a, int b) {
        return a % b;
    }

    public static int trunca(double x) {
        return (int) x;
    }

    // Exercício 1: Determinação do dia da semana
    public static void diaSemana() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int d = sc.nextInt();
        System.out.print("Digite o mês: ");
        int m = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        if (m == 1 || m == 2) {
            m += 10;
            ano--;
        } else {
            m -= 2;
        }

        int a = ano % 100;
        int s = ano / 100;
        int diaSemana = resto((trunca(2.6 * m - 0.1) + d + a + quociente(a, 4) + quociente(s, 4) - 2 * s), 7);
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        System.out.printf("A data %02d/%02d/%d cai em um %s%n", d, m, ano, dias[(diaSemana + 7) % 7]);
    }

    // Exercício 2: Validação de data
    public static boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1) return false;
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) diasPorMes[1] = 29;
        return dia <= diasPorMes[mes - 1];
    }

    // Exercício 3: Jokenpô
    public static void jokenpo() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        
        System.out.println("Escolha: 0 - Pedra | 1 - Papel | 2 - Tesoura");
        int escolha = sc.nextInt();
        int escolhaComputador = rand.nextInt(3);

        System.out.printf("Você escolheu %s, Computador escolheu %s%n", opcoes[escolha], opcoes[escolhaComputador]);

        if (escolha == escolhaComputador) System.out.println("Empate!");
        else if ((escolha == 0 && escolhaComputador == 2) ||
                 (escolha == 1 && escolhaComputador == 0) ||
                 (escolha == 2 && escolhaComputador == 1))
            System.out.println("Você ganhou!");
        else System.out.println("Computador ganhou!");
    }

    // Exercício 4: Adivinhação de número
    public static void adivinhacao() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero, chute, tentativas = 0;

        do {
            System.out.print("Digite um número entre 1 e 99: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 99);

        do {
            chute = rand.nextInt(99) + 1;
            tentativas++;
        } while (chute != numero);

        System.out.printf("Número adivinhado após %d tentativas!%n", tentativas);
    }


    // Exercício 5: Verificação de senha
    public static boolean senhaValida(String senha) {
        if (senha.length() < 8) return false;

        boolean temMaiuscula = false, temMinuscula = false, temNumero = false, temEspecial = false;
        
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (c >= 'A' && c <= 'Z') temMaiuscula = true;
            else if (c >= 'a' && c <= 'z') temMinuscula = true;
            else if (c >= '0' && c <= '9') temNumero = true;
            else temEspecial = true;
        }

        return temMaiuscula && temMinuscula && temNumero && temEspecial;
    }

    // Exercício 6: Soma de vetores 
    public static void somaVetores() {
        int[] v1 = {1, 5, 8, 3, 9};
        int[] v2 = {8, 6, 2, 0, 7};
        int[] v3 = new int[v1.length + 1]; 
        int carry = 0;

        for (int i = v1.length - 1; i >= 0; i--) {
            int soma = v1[i] + v2[i] + carry;
            v3[i + 1] = soma % 10; 
            carry = soma / 10; 
        }

        v3[0] = carry;

        System.out.print("V[1] = ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println();

        System.out.print("V[2] = ");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println();

        System.out.print("V[3] = ");
        boolean leadingZero = true; 
        for (int i = 0; i < v3.length; i++) {
            if (v3[i] != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                System.out.print(v3[i] + " ");
            }
        }
        System.out.println();
    }

    // Exercício 7: União de vetores sem repetição
    public static void uniaoVetores() {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[5], v2 = new int[5], resultado = new int[10];
        int tamanho = 0;

        System.out.println("Digite 5 valores para v1:");
        for (int i = 0; i < 5; i++) {
            v1[i] = sc.nextInt();
            resultado[tamanho++] = v1[i];
        }

        System.out.println("Digite 5 valores para v2:");
        for (int i = 0; i < 5; i++) {
            v2[i] = sc.nextInt();
            boolean existe = false;
            for (int j = 0; j < tamanho; j++) {
                if (resultado[j] == v2[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                resultado[tamanho++] = v2[i];
            }
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }

    // Exercício 8: Ordenação de vetor 
    public static void ordenarVetor() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = sc.nextInt();
        }

        // Implementação do Bubble Sort
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // Exercício 9: Encontrar MINIMAX 
    public static void minimax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a ordem da matriz quadrada: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int max = matriz[0][0];
        int linhaMax = 0;

        // Encontrar o maior elemento e sua linha
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    linhaMax = i;
                }
            }
        }

        // Encontrar o menor elemento da linha onde está o maior número
        int minimax = matriz[linhaMax][0];
        for (int j = 1; j < n; j++) {
            if (matriz[linhaMax][j] < minimax) {
                minimax = matriz[linhaMax][j];
            }
        }

        System.out.println("O elemento MINIMAX é: " + minimax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha um exercício (5 a 9) ou 0 para sair:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 5:
                    System.out.print("Digite uma senha: ");
                    String senha = sc.next();
                    System.out.println(senhaValida(senha) ? "Senha válida" : "Senha inválida");
                    break;
                case 6:
                    somaVetores();
                    break;
                case 7:
                    uniaoVetores();
                    break;
                case 8:
                    ordenarVetor();
                    break;
                case 9:
                    minimax();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

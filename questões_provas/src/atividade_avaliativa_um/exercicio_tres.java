package atividade_avaliativa_um;

import java.util.Scanner;

public class exercicio_tres{

    // Funções para calcular potências
    public static int quadrado(int n) {
        return n * n;
    }

    public static int cubo(int n) {
        return n * n * n;
    }

    public static int quarto(int n) {
        return n * n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Lendo o número inteiro positivo
        System.out.print("Digite um número inteiro positivo (até 4 dígitos): ");
        n = sc.nextInt();

        // Verificando se n é um número de Armstrong
        if (n < 0 || n > 9999) {
            System.out.println("Número inválido! O número deve ser positivo e ter até 4 dígitos.");
        } else {
            int original = n;
            int soma = 0;
            int numDigitos = 0;

            // Contando o número de dígitos
            int temp = n;
            while (temp > 0) {
                temp /= 10;
                numDigitos++;
            }

            // Calculando a soma das potências
            temp = original;
            while (temp > 0) {
                int digito = temp % 10;
                switch (numDigitos) {
                    case 2:
                        soma += quadrado(digito);
                        break;
                    case 3:
                        soma += cubo(digito);
                        break;
                    case 4:
                        soma += quarto(digito);
                        break;
                }
                temp /= 10;
            }

            // Verificando se é um número de Armstrong
            if (soma == original) {
                System.out.println(original + " é um número de Armstrong.");
            } else {
                System.out.println(original + " não é um número de Armstrong.");
            }
        }

        sc.close();
    }
}

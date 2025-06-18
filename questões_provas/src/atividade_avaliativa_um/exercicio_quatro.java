package atividade_avaliativa_um;

import java.util.Scanner;

public class exercicio_quatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] VET = new int[20];
        int[] VET2 = new int[20];
        int tamanhoVET2 = 0;

        // Lendo os elementos do vetor VET
        System.out.println("Digite 20 números inteiros (pode haver repetidos):");
        for (int i = 0; i < VET.length; i++) {
            VET[i] = sc.nextInt();
        }

        // Removendo duplicados e armazenando em VET2
        for (int i = 0; i < VET.length; i++) {
            boolean existe = false;
            for (int j = 0; j < tamanhoVET2; j++) {
                if (VET[i] == VET2[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                VET2[tamanhoVET2] = VET[i];
                tamanhoVET2++;
            }
        }

        // Ordenando VET2 (Bubble Sort)
        for (int i = 0; i < tamanhoVET2 - 1; i++) {
            for (int j = 0; j < tamanhoVET2 - i - 1; j++) {
                if (VET2[j] > VET2[j + 1]) {
                    // Troca
                    int temp = VET2[j];
                    VET2[j] = VET2[j + 1];
                    VET2[j + 1] = temp;
                }
            }
        }

        // Exibindo o vetor VET2
        System.out.println("Vetor sem elementos repetidos e ordenado:");
        for (int i = 0; i < tamanhoVET2; i++) {
            System.out.print(VET2[i] + " ");
        }
    }
}

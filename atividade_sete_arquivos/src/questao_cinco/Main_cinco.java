/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_cinco;

/**
 *
 * @author lucas
 */
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main_cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("alunos.dat"))) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
                String nome = sc.nextLine();

                System.out.println("Digite o código do aluno: ");
                int codigo = Integer.parseInt(sc.nextLine());

                System.out.println("Digite a 1ª nota: ");
                int nota1 = Integer.parseInt(sc.nextLine());

                System.out.println("Digite a 2ª nota: ");
                int nota2 = Integer.parseInt(sc.nextLine());

                // Escreve o tamanho do nome
                out.writeInt(nome.length());

                // Escreve cada caractere do nome
                for (char c : nome.toCharArray()) {
                    out.writeChar(c);
                }

                // Escreve o código e as notas
                out.writeInt(codigo);
                out.writeInt(nota1);
                out.writeInt(nota2);
            }

            System.out.println("Dados gravados com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        sc.close();
    }
}


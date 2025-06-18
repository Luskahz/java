/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_sete;

/**
 *
 * @author lucas
 */
import java.io.*;
import java.util.Scanner;

public class Main_sete{
    public static void copiarArquivo(String nomeOrigem, String nomeDestinoInicial) {
        Scanner sc = new Scanner(System.in);
        File origem = new File(nomeOrigem);
        File destino = new File(nomeDestinoInicial);

        // Verifica se o arquivo de origem existe
        if (!origem.exists()) {
            System.out.println("Arquivo de origem não existe: " + nomeOrigem);
            return;
        }

        // Verifica se o destino pode ser criado
        while (destino.exists()) {
            System.out.println("O arquivo de destino já existe: " + nomeDestinoInicial);
            System.out.print("Deseja sobrescrever? (s/n): ");
            String resposta = sc.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {
                break; // vai sobrescrever
            } else {
                System.out.print("Digite um novo nome para o arquivo de destino: ");
                nomeDestinoInicial = sc.nextLine();
                destino = new File(nomeDestinoInicial);
            }
        }

        // Copia o conteúdo do arquivo de origem para o destino (binário)
        try (
            FileInputStream fis = new FileInputStream(origem);
            FileOutputStream fos = new FileOutputStream(destino)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Arquivo copiado com sucesso para: " + destino.getPath());
        } catch (IOException e) {
            System.out.println("Erro durante a cópia: " + e.getMessage());
        }
    }

    // Método main para testar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo de origem (.dat): ");
        String origem = sc.nextLine();

        System.out.print("Digite o nome do arquivo de destino (.dat): ");
        String destino = sc.nextLine();

        copiarArquivo(origem, destino);
    }
}


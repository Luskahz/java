/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lucas
 */
package questao_quatro;

public class Main_quatro {
    public static void main(String[] args) {
        // Criando uma data específica
        Data data1 = new Data(10, 6, 2025);

        // Criando a data atual
        Data dataAtual = new Data();

        // Mostrando as datas
        System.out.println("Data 1: " + data1.DtString());
        System.out.println("Data Atual: " + dataAtual.DtString());

        // Avançando um dia em data1
        data1.avancar();
        System.out.println("Data 1 após avançar um dia: " + data1.DtString());

        // Comparando as duas datas
        int comparacao = Data.comparar(data1, dataAtual);
        switch (comparacao) {
            case 0 -> System.out.println("As datas são iguais.");
            case 1 -> System.out.println("Data 1 é mais recente.");
            default -> System.out.println("Data Atual é mais recente.");
        }

        // Verificando se o ano é bissexto
        if (data1.bicesto()) {
            System.out.println("O ano de Data 1 é bissexto.");
        } else {
            System.out.println("O ano de Data 1 não é bissexto.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_um;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INSIRA UM NUMERO: ");
        try{
            int num = sc.nextInt();
            File arquivo = new File("tabuada_"+num+".txt");
            System.out.println("o numero inserido foi: " + num + " Gerando tabuada..");
                FileWriter writer = new FileWriter(arquivo);
                for (int i = 1; i <= 10; i++) {
                    writer.write(num + " X " + i + " = " + num * i+ "\n");
                }
                writer.close();
            
        } catch(IOException e){
            e.printStackTrace();
        } catch (InputMismatchException e ){
            System.out.println("insira um valor numerico inteiro, eu sei tratar melhor, mas por enquanto eu quero ir pra questão 2");
        }
        
    }
    
}

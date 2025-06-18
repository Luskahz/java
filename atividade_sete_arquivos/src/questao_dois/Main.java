/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_dois;

import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("INSIRA O NUMERO: ");
        try{
            int num = sc.nextInt();
            File f = new File("tabuada_"+num+".txt");
            if(!f.exists()){
                System.out.println("Essa tabuada ainda n existe");
            } else{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String linha;
                
                while((linha = br.readLine()) != null){
                    System.out.println(linha);
                } br.close();
            }
        } catch(InputMismatchException e){
            System.out.println("insira um numero inteiro");
        } catch(FileNotFoundException e){
            System.out.println("arquivo existente n encontrado");
        } catch (IOException e ){
            System.out.println("erro boy q q se digitou ai");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_dois;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main_dois {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while(!valido){
            System.out.println("INSIRA UM NUMERO: ");
            try{
                int num = sc.nextInt();
                int result = num * num;
                System.out.println("Quadrado: " + result);
                valido = true;
            }catch(InputMismatchException e){
                System.out.println("Opa… Acho que você se enganou! Digite novamente…");
                sc.nextLine();
                
            }
            
        }
        System.out.println("fim do main");
        
    }
    
}

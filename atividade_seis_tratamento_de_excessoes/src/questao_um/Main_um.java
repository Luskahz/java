/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_um;
/**
 *
 * @author lucas
 */
public class Main_um {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {     
            try{
                array[i] = i;
                System.out.println(i);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ó o array django");
            }
        }
        System.out.println("fim do metodo2");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao_um;

public class main {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 2));
        System.out.println("Raiz Quadrada de 16: " + calc.raizQuadrada(16));
        System.out.println("Potência 2^3: " + calc.potencia(2, 3));
    }
    
}

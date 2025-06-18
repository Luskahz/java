/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_um;

/**
 *
 * @author lucas
 */
public class CalculadoraCientifica extends Calculadora {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }
    
    public double raizQuadrada(double a){
        return Math.sqrt(a);
    }
    public double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
}

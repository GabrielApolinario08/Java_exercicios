/*1) [POO-014] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário
        deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de
        conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro
        de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a
        fórmula F= (9*C/5) + 32.
        Entrada: Saída:
        Entre com temperatura em Celsius: 0 A temperatura em Fahrenheit é: 32
        Entre com temperatura em Celsius: 100 A temperatura em Fahrenheit é: 212
        Entre com temperatura em Celsius: 30 A temperatura em Fahrenheit é: 86*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius: ");
        double temp = scanner.nextDouble();

        System.out.println("A temperatura em Fahrenheit é: " + conversor(temp));
    }

    static double conversor(double temp) {
        return (9 * temp / 5) + 32;
    }
}
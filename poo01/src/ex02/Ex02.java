/*Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética
        conforme o diagrama abaixo e após uma classe que teste essa implementação.*/


//Gabriel Apolinário Fabrício
package ex02;

public class Ex02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setNumero01(10);
        calc.setNumero02(2);
        System.out.println("Número 1: " + calc.getNumero01());
        System.out.println("Número 2: " + calc.getNumero02());
        System.out.println("Soma: " + calc.soma());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("Multiplicar: " + calc.multiplicar());
        System.out.println("Dividir: " + calc.dividir());
    }
}

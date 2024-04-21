/*4) [POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo
        Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores,
        'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por
        'b² - 4ac'.
        Entrada:                Saída:
        a: 1 b: -1 c: -12       Delta é 49.
        a: 1 b: -4 c: -5        Delta é 36.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        System.out.println("Delta é " + delta(a, b, c) + ".");
    }

    static double delta(double a, double b, double c) {
        double delta = 0;
        return delta = Math.pow(b, 2) - (4 * a * c);
    }
}
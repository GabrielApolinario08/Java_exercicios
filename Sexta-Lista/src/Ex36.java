/*36) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
        o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
        positivo imprimir a sequência de termos: 1, 1/2, 1/3, 1/4, 1/5, ... */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int termos = scanner.nextInt();
        int cont = 0, x = 1;
        double i = 1;
        while (true) {
            if (termos < 0) {
                System.out.println("Digite outro número maior que zero: ");
                termos = scanner.nextInt();
            } else if (termos == 0) {
                System.out.println("Programa finalizado!");
                break;
            } else {
                System.out.printf("%.2f, ", i);
                cont++;
                i = 1 / (double)++x;
                if (termos == cont) {
                    break;
                }
            }
        }
    }
}

/*40) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
        o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
        positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20
        termos.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int termos = scanner.nextInt();
        int i = 1;
        boolean stopMetade1 = false;
        while (true) {
            if (termos < 0) {
                System.out.println("Digite outro número maior que zero: ");
                termos = scanner.nextInt();
            } else if (termos == 0) {
                System.out.println("Programa finalizado!");
                break;
            } else {
                if (i <= termos / 2 && !stopMetade1) {
                    System.out.printf("%d, ", i);
                    i++;
                    if (i == termos / 2) {
                        System.out.printf("%d, ", i);
                        if (termos % 2 != 0) {
                            System.out.printf("%d, ", i + 1);
                        }
                        stopMetade1 = true;
                    }
                }
                if (stopMetade1) {
                    System.out.printf("%d, ", i);
                    i--;
                    if (i == 1) {
                        System.out.printf("%d.", i);
                        break;
                    }
                }
            }
        }
    }
}

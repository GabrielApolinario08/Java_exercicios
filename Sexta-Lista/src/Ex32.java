/*32) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
        o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
        positivo imprimir a sequência de termos: 0, 2, 4, 6, ...*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int termos = scanner.nextInt();
        int cont = 0, i = 0;
        while (true) {
            if (termos < 0) {
                System.out.println("Digite outro número maior que zero: ");
                termos = scanner.nextInt();
            } else if (termos == 0) {
                System.out.println("Programa finalizado!");
                break;
            } else {
                System.out.printf("%d, ", i);
                cont++;
                i += 2;
                if (termos == cont) {
                    break;
                }
            }
        }
    }
}

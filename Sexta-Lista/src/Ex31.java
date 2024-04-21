/*31) Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
        o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
        positivo imprimir a sequência de termos: 1, 2, 3, 4, ...*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        System.out.println("Digite uma quantidade de termos: ");
        int termos = scanner.nextInt();

        while (true) {
            if (termos < 0) {
                System.out.println("Digite outro número maior que zero: ");
                termos = scanner.nextInt();
            } else if(termos == 0) {
                System.out.println("Programa finalizado!");
                break;
            } else {
                System.out.printf("%d, ", cont);
                cont++;
                if (cont == termos + 1) {
                    break;
                }
            }
        }
    }
}
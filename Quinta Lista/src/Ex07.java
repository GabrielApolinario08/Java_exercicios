/*7) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite outro número: (Diferente do primeiro)");
        int valor2 = scanner.nextInt();
        if (valor2 == valor1) {
            System.out.println("ERRO! Digite valores diferentes!");
            System.exit(1);
        }
        if (valor1 > valor2) {
            System.out.printf("Ordem crescente: %d - %d", valor2, valor1);
        } else {
            System.out.printf("Ordem crescente: %d - %d", valor1, valor2);
        }
    }
}

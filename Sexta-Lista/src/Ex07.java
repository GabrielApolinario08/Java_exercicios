/* 7) Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever
a tabuada de 1 a 10 do valor lido. */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um valor de 1 a 10: ");
        int valor = scanner.nextInt();

        if (valor <= 0 || valor >= 11) {
            System.out.println("Valor informado incorretamente!");
        } else {
            for (int i = 1 ; i <= 10 ; i++) {
                System.out.printf("%d x %d = %d\n", valor, i, valor * i);
            }
        }
    }
}

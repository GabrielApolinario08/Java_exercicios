/*21) Escreva um programa para ler um vetor AB de 10 posições com elementos
        fornecidos pelo usuário. Para cada elemento ímpar encontrado, multiplique ele por
        dois, gerando assim um vetor de elementos pares e ao final exiba o resultado.*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AB = new int[10];
        for (int i = 0 ; i < AB.length ; i++) {
            System.out.println("Informe o valor da " + (i + 1) + " posição: ");
            AB[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < AB.length ; i++) {
            if (AB[i] % 2 != 0) {
                AB[i] = (AB[i] * 2);
            }
        }

        System.out.print("Vetor de elementos pares: ");
        for (int i : AB) {
            System.out.print(i + " ");
        }
    }
}

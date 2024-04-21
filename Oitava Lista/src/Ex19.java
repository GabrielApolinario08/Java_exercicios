/*19) Escreva um programa para ler um vetor Z de 10 posições com elementos
        fornecidos pelo usuário e colocar os elementos em ordem crescente. Ao final imprimir
        o vetor Z ordenado.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Z = new int[10];
        for (int i = 0 ; i < Z.length ; i++) {
            System.out.println("Informe o valor da " + (i + 1) + " posição: ");
            Z[i] = scanner.nextInt();
        }

        Arrays.sort(Z);

        System.out.print("Vetor Z em ordem crescente: ");
        for (int valor : Z) {
            System.out.print(valor + " ");
        }
    }
}

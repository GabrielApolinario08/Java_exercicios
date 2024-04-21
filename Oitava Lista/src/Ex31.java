/*31) Escreva um programa para criar um vetor de String AM de dimensão N definida
        pelo usuário (N<=10). Solicitar a entrada dos N valores String (palavras ou frases).
        Imprimir o vetor AM original. Ordenar o vetor de String AM de forma crescente.
        Imprimir o vetor AM ordenado.
        Ex:
        Quantidade de elementos do vetor AM: 5
        Vetor AM [ “mamao”, “abacate”, “jaca”, “uva”, “banana” ]
        (vetor original - 5 elementos)
        Vetor AM [ “abatacate”, “banana”, “jaca”, “mamao”, “uva” ]
        (vetor ordenado - 5 elementos)*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        String[] AM;
        System.out.println("Informe a quantidade de elementos do vetor AM: (<=10)");
        AM = new String[scanner.nextInt()];
        while (AM.length > 10) {
            System.out.println("Informe corretamente a quantidade de elementos do vetor AM: (<=10)");
            AM = new String[scanner.nextInt()];
        }
        System.out.println("Informe os valores de AM, sendo palavras ou frases!");
        for (int i = 0 ; i < AM.length ; i++) {
            System.out.print((i + 1) + " valor: ");
            AM[i] = scannerString.nextLine();
        }

        System.out.println("\tVetor AM original: " + Arrays.toString(AM));
        Arrays.sort(AM);
        System.out.println("\n\tVetor AM ordenado: " + Arrays.toString(AM));
    }
}

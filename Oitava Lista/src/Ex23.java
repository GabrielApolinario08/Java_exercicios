/*23) Escreva um programa para ler um vetor AD de dimensão definida e com
        elementos fornecidos pelo usuário e colocar, somente, os elementos PARES em ordem
        crescente. Ao final imprimir o vetor AD ordenado.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AD, elementosPares;
        int j = 0, tamanhoPares = 0;

        System.out.println("Informe a quantidade de elementos do vetor: ");
        AD = new int[scanner.nextInt()];


        for (int i = 0 ; i < AD.length ; i++) {
            System.out.println("Informe o elemento da " + (i + 1) + " posição: ");
            AD[i] = scanner.nextInt();
            if (AD[i] % 2 == 0) {
                tamanhoPares++;
            }
        }
        elementosPares = new int[tamanhoPares];
        for (int i = 0 ; i < AD.length ; i++) {
            if (AD[i] % 2 == 0) {
                elementosPares[j] = AD[i];
                j++;
            }
        }

        Arrays.sort(elementosPares);
        j = 0;
        for (int i = 0 ; i < AD.length ; i++) {
            if (AD[i] % 2 == 0) {
                AD[i] = elementosPares[j];
                j++;
            }
        }

        System.out.print("Vetor AD com elementos pares em ordem crescente: ");
        for (int i : AD) {
            System.out.print(i + " ");
        }
    }
}

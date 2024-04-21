/*12) Escreva um programa para ler um vetor de inteiros P de 10 elementos e
        imprimir o vetor lido. Ler outro vetor de inteiros Q de 15 elementos e
        imprimir este vetor lido. Construir outro vetor R com todos os elementos
        lidos de P e de Q e imprimir este vetor obtido. (Concatenação)*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] P = new int[10], Q = new int[15], R = new int[25];

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor P: ");
            P[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < 15 ; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor do vetor Q: ");
            Q[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < 10 ; i++) {
            R[i] = P[i];
        }
        for (int i = 10 ; i < 25 ; i++) {
            R[i] = Q[i - 10];
        }
        System.out.println("vetor P:");
        mostraVetor(P);
        System.out.println("vetor Q:");
        mostraVetor(Q);
        System.out.println("vetor R:");
        mostraVetor(R);
    }

    public static void mostraVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

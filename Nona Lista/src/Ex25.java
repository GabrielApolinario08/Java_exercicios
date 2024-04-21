/*25) Escreva um programa em Java para gerar uma matriz Y (N x M). Ordem os elementos da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int M = scanner.nextInt();
        int[][] Y = new int[N][M];
        int[] vetor = new int[N * M];
        int cont = 0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                Y[i][j] = (int)(Math.random() * 11);
                vetor[cont] = Y[i][j];
                cont++;
            }
        }
        System.out.println("Matriz original: ");
        exibirMatriz(Y);
        Arrays.sort(vetor);
        cont = 0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                Y[i][j] = vetor[cont];
                cont++;
            }
        }
        System.out.println("Matriz ordenada de forma crescente: ");
        exibirMatriz(Y);
    }

    static void exibirMatriz(int[][] matriz) {
        for (int[] linha:matriz) {
            for (int valor:linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }
}
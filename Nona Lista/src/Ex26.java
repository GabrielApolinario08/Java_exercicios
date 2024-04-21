/*26) Escreva um programa em Java para gerar uma matriz W (N x M). Ordem
        os elementos da matriz de forma decrescente e imprimir a matriz original e a
        matriz ordenada.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int M = scanner.nextInt();
        int[][] W = new int[N][M];
        int[] vetor = new int[N * M];
        int cont = 0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                W[i][j] = (int)(Math.random() * 11);
                vetor[cont] = W[i][j];
                cont++;
            }
        }
        System.out.println("Matriz original: ");
        exibirMatriz(W);
        Arrays.sort(vetor);
        cont = vetor.length - 1;
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                W[i][j] = vetor[cont];
                cont--;
            }
        }
        System.out.println("Matriz ordenada de forma decrescente: ");
        exibirMatriz(W);
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
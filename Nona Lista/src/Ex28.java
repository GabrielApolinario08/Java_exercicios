/*28) Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar
        as colunas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int M = scanner.nextInt();
        int[][] Z = new int[N][M];
        int[] vetorColuna = new int[N], vetorTotal = new int[N * M];
        int cont = 0, incremento = 0;
        for (int j = 0 ; j < M ; j++) {
            for (int i = 0 ; i < N ; i++) {
                Z[i][j] = (int)(Math.random() * 11);
                vetorColuna[cont] = Z[i][j];
                cont++;
            }
            Arrays.sort(vetorColuna);
            cont = 0;
            while (cont < vetorColuna.length) {
                vetorTotal[incremento] = vetorColuna[cont];
                cont++;
                incremento++;
            }
            cont = 0;
        }
        System.out.println("Matriz original: ");
        exibirMatriz(Z);
        for (int j = 0 ; j < M ; j++) {
            for (int i = 0; i < N; i++) {
                Z[i][j] = vetorTotal[cont];
                cont++;
            }
        }
        System.out.println("Matriz ordenada com as colunas de forma crescente: ");
        exibirMatriz(Z);
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
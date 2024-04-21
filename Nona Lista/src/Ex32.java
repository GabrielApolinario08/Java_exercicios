/*32) Escreva um programa em Java para gerar uma matriz (N x M). A matriz
        deve ser criada com a seguinte dimensão ((N+1) x (M+1)). Para cada linha
        imprimir a soma na casa final. Repetir o processo para coluna. Na posição
        ((N+1) x (M+1)), apresentar a soma dos elementos da diagonal principal (linha = coluna).*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int N = scanner.nextInt() + 1;
        System.out.println("Informe o número de colunas da matriz: ");
        int M = scanner.nextInt() + 1;

        int[][] matriz = new int[N][M];
        int somaLinha = 0, somaDiagPrinc = 0, somaColuna = 0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                matriz[i][j] = (int)(Math.random() * 11);
            }
        }
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M - 1 ; j++) {
                somaLinha += matriz[i][j];
            }
            matriz[i][M - 1] = somaLinha;
            somaLinha = 0;
        }
        for (int j = 0 ; j < M ; j++) {
            for (int i = 0 ; i < N - 1 ; i++) {
                somaColuna += matriz[i][j];
            }
            matriz[N - 1][j] = somaColuna;
            somaColuna = 0;
        }

        for (int j = 0 ; j < N - 1 ; j++) {
            for (int i = 0 ; i < M - 1 ; i++) {
                if (i == j) {
                    somaDiagPrinc += matriz[i][j];
                }
            }
        }
        matriz[N - 1][M - 1] = somaDiagPrinc;


        System.out.println("Matriz resultante: ");
        for (int[] linha:matriz) {
            for (int valor:linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }
}
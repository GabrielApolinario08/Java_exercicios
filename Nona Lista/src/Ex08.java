/*8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
        vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da
        matriz. Imprimir a matriz e os vetores. Validar para caso não haja uma das
        duas possibilidades (sem elementos pares ou ímpares).*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quatidade de linhas da matriz: ");
        int N = scanner.nextInt();
        System.out.println("Informe a quantidade de coluas da matriz: ");
        int M = scanner.nextInt();
        int[][] F = new int[N][M];
        int[] impar, par;
        int increPar = 0, increImpar = 0, qtdPar = 0, qtdImpar = 0;
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                    F[l][c] = (int)(Math.random() * 50);
                    if (F[l][c] % 2 == 0) {
                        qtdPar++;
                    } else {
                        qtdImpar++;
                    }
                    System.out.print("\t" + F[l][c]);
            }
            System.out.println();
        }
        impar = new int[qtdImpar];
        par = new int[qtdPar];
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < M ; c++) {
                if (F[l][c] % 2 == 0) {
                    par[increPar] = F[l][c];
                    increPar++;
                } else {
                    impar[increImpar] = F[l][c];
                    increImpar++;
                }
            }
        }
        if (qtdPar == 0) {
            System.out.println("Não existe elementos par na matriz.");
        } else {
            System.out.println("Elementos par da matriz: " + Arrays.toString(par));
        }
        if (qtdImpar == 0) {
            System.out.println("Não existe elementos ímpar na matriz.");
        } else {
            System.out.println("Elementos ímpar da matriz: " + Arrays.toString(impar));
        }

    }
}
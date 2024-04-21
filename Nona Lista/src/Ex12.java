/*
12) Escreva um programa em Java para gerar uma matriz quadrada L de dimensão N. Imprimir os elementos da acima da diagonal principal (exclusa).
*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] L = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                L[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + L[l][c]);
            }
            System.out.println();
        }
        System.out.println("Elementos de cima da diagonal principal: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l < c) {
                    System.out.print("\t" + L[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
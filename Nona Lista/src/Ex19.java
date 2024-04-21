/*19) Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N.
        Imprimir os elementos da “asa da borboleta”.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a dimensão da matriz quadrada: ");
        int N = scanner.nextInt();
        int[][] S = new int[N][N];
        System.out.println("Matriz: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                S[l][c] = (int)(Math.random() * 50);
                System.out.print("\t" + S[l][c]);
            }
            System.out.println();
        }
        System.out.println("Elementos da asa borboleta: ");
        for (int l = 0 ; l < N ; l++) {
            for (int c = 0 ; c < N ; c++) {
                if (l + c == N - 1) {
                    System.out.print("\t" + S[l][c]);
                } else if(l + c > N - 1) {
                    System.out.print("\t" + S[l][c]);
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
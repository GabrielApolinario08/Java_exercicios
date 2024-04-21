/*24) Escreva um programa em Java para solicitar ao usuário dimensões de
        uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci
        e imprimir o resultado.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int l = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int c = scanner.nextInt();
        int[][] matriz = new int[l][c];
        int n1 = 0, n2 = 1, n3 = n1 + n2;
        for (int i = 0 ; i < l ; i++) {
            for (int j = 0 ; j < c ; j++) {
                matriz[i][j] = n1;
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
        }

        System.out.println("Matriz com os elementos da sequência de fibonacci: ");
        for (int[] linha:matriz) {
            for (int valor:linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }
}
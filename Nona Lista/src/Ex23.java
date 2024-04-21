/*23) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
        Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de linhas da matriz: ");
        int l = scanner.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int c = scanner.nextInt();
        int[][] matriz = new int[l][c];
        int cont = 2;

        for (int i = 0 ; i < l ; i++) {
            for (int j = 0 ; j < c ; j++) {
                while (true) {
                    if (ePrimo(cont)) {
                        matriz[i][j] = cont;
                        cont++;
                        break;
                    }
                    cont++;
                }


            }
        }

        System.out.println("Matriz de números primos: ");
        for (int[] linha : matriz) {
            for (int i : linha) {
                System.out.print("\t" + i);
            }
            System.out.println();
        }
    }

    static boolean ePrimo(int num) {
        for (int i = 2 ; i < num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
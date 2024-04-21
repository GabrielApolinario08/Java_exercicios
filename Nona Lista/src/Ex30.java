/*30) Item ao exercício anterior, mas utilizando a sequencia de Fibonacci.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quatidade de elementos: ");
        int[] vetor = new int[scanner.nextInt()];
        for (int i = 0 ; i < vetor.length ; i++) {
            vetor[i] = (int)(Math.random() * 11);
        }
        System.out.println("Vetor gerado: " + Arrays.toString(vetor));

        int[][] matriz = new int[vetor.length][];
        for (int i = 0 ; i < matriz.length ; i++) {
            matriz[i] = linhaMatriz(vetor[i]);
        }


        System.out.println("Matriz gerada: ");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print("\t" + valor);
            }
            System.out.println();
        }
    }

    static int[] linhaMatriz(int num) {
        int[] linha = new int[num + 1];
        linha[0] = num;
        int i = 1, n1 = 0, n2 = 1, n3 = n1 + n2;
        while (i < linha.length) {
            linha[i] = n1;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            i++;
        }
        return linha;
    }

}
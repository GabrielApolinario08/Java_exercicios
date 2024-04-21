/*29) Escreva um programa em Java para solicitar ao usuário um valor. Este valor lido
        será a quantidade de elementos de um vetor. Gerar os elementos do vetor. A partir do
        vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade
        de elementos do vetor e as colunas serão os valores dos elementos do vetor mais um.
        Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo elemento
        do vetor criado inicialmente e os demais elementos da linha serão formados
        pela sequencia de Primos. Imprimir a matriz resultante.
        Exemplo:
        Quantidade de elementos: 4
        Vetor gerado: 3, 5, 1, 6
        Matriz gerada: 3, 1, 2, 3
                       5, 1, 2, 3, 5, 7
                       1, 1
                       6, 1, 2, 3, 5, 7, 11*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex29 {
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
        int valor = 2;
        linha[0] = num;
        int i = 1;
        while (i < linha.length) {
            if (ePrimo(valor)) {
                linha[i] = valor;
                i++;
            }
            valor++;
        }
        return linha;
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
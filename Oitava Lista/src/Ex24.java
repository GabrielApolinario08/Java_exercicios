/*24) Escreva um programa para ler um vetor AE de dimensão e com
        elementos fornecidos pelo usuário e colocar, somente, os elementos
        ÍMPARES em ordem decrescente. Ao final imprimir o vetor AE ordenado.*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AE, elementosImpares, imparesDecres;
        int j = 0, tamanhoImpares = 0;

        System.out.println("Informe a quantidade de elementos do vetor: ");
        AE = new int[scanner.nextInt()];


        for (int i = 0 ; i < AE.length ; i++) {
            System.out.println("Informe o elemento da " + (i + 1) + " posição: ");
            AE[i] = scanner.nextInt();
            if (AE[i] % 2 != 0) {
                tamanhoImpares++;
            }
        }
        elementosImpares = new int[tamanhoImpares];

        for (int i = 0 ; i < AE.length ; i++) {
            if (AE[i] % 2 != 0) {
                elementosImpares[j] = AE[i];
                j++;
            }
        }
        Arrays.sort(elementosImpares);
        imparesDecres = new int[elementosImpares.length];
        for (int i = 0 ; i < elementosImpares.length ; i++) {
            imparesDecres[i] = elementosImpares[((elementosImpares.length - 1) - i)];
        }

        j = 0;
        for (int i = 0 ; i < AE.length ; i++) {
            if (AE[i] % 2 != 0) {
                AE[i] = imparesDecres[j];
                j++;
            }
        }

        System.out.print("Vetor AE com os elementos ímpares em ordem decrescente: ");
        for (int valor:AE) {
            System.out.print(valor + " ");
        }
    }
}

/*25) Escreva um programa para ler um vetor AF de dimensão definida e com elementos
        fornecidos pelo usuário e ordenar crescente de forma crescente os elementos ÍMPARES
        e decrescente os elementos PARES. Ao final imprimir o vetor AF ordenado.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de elementos do vetor: ");
        int[] AF = new int[scanner.nextInt()], pares, impares, paresDecres;
        int qtdPar = 0, qtdImpar = 0, k = 0, j = 0;

        for (int i = 0 ; i < AF.length ; i++) {
            System.out.println("Informe o valor do " + (i + 1) + " elemento: ");
            AF[i] = scanner.nextInt();
            if (AF[i] % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }
        pares = new int[qtdPar];
        paresDecres = new int[qtdPar];
        impares = new int[qtdImpar];
        for (int i = 0 ; i < AF.length ; i++) {
            if (AF[i] % 2 == 0) {
                pares[j] = AF[i];
                j++;
            } else {
                impares[k] = AF[i];
                k++;
            }
        }
        Arrays.sort(pares);
        Arrays.sort(impares);

        for (int i = 0 ; i < pares.length ; i++) {
            paresDecres[i] = pares[(pares.length - 1) - i];
        }



        j = k = 0;
        for (int i = 0 ; i < AF.length ; i++) {
            if (AF[i] % 2 == 0) {
                AF[i] = paresDecres[j];
                j++;
            } else {
               AF[i] = impares[k];
               k++;
            }
        }

        System.out.print("Vetor AF com elementos ímpares de forma crescente e elementos pares de forma decrescente: ");
        for (int i : AF) {
            System.out.print(i + " ");
        }
    }
}

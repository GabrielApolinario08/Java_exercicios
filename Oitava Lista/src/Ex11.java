/*11) Escreva um programa para ler dois vetores QA e QB de inteiros de 5 elementos e
        imprimir os vetores lidos. Construir outro vetor QC de tamanho 10, com todos os
        elementos lidos de QA e de QB e imprimir este vetor obtido. (Intercalação)*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] QA = new int[5], QB = new int[5], QC = new int[10];
        int j = 0;

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor de QA: ");
            QA[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor de QB: ");
            QB[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < 5 ; i++) {
            QC[j] = QA[i];
            j++;
            QC[j] = QB[i];
            j++;
        }

        System.out.print("Valores de QA: ");
        mostraVetor(QA);
        System.out.println();

        System.out.print("Valores de QB: ");
        mostraVetor(QB);
        System.out.println();

        System.out.print("Valores de QC: ");
        mostraVetor(QC);
        System.out.println();
    }

    public static void mostraVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}

/*10) Escreva um programa para ler dois vetores PA e PB de inteiros de 5
        elementos e imprimir os vetores lidos. Construir outro vetor PC de tamanho
        10, com todos os elementos lidos de PA e de PB e imprimir este vetor obtido.
        (Concatenação)*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] PA = new int[5], PB = new int[5], PC = new int[10];

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor de PA: ");
            PA[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor de PB: ");
            PB[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < 5 ; i++) {
            PC[i] = PA[i];
            PC[i + 5] = PB[i];
        }

        System.out.print("Valores de PA: ");
        mostraVetor(PA);
        System.out.println();

        System.out.print("Valores de PB: ");
        mostraVetor(PB);
        System.out.println();

        System.out.print("Valores de PC: ");
        mostraVetor(PC);
        System.out.println();
    }

    public static void mostraVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
/*29) Escreva um programa para criar um vetor AJ de dimensão definida pelo usuário
        (>=10) e gerar os elementos aleatórios e não repetidos. Ordenar crescente. O usuário
        deverá, em 10 tentativas, descobrir um elemento do vetor. Caso acerte, o programa
        deverá imprimir o vetor AJ e a posição onde o elemento do usuário estava. Uma dica
        importante para aumentar a “emoção” e a dificuldade é colocar um aleatório grande.*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AJ;
        int numAleatorio, cont = 0, palpite;
        boolean repetido;
        System.out.println("Informe a quantidade de elementos do vetor AJ: (>=10)");
        AJ = new int[scanner.nextInt()];
        while (AJ.length < 10){
            System.out.println("Informe corrtamente a quantidade de elementos do vetor AJ: (>=10)");
            AJ = new int[scanner.nextInt()];
        }

        while (cont < AJ.length) {
            numAleatorio = (int)(Math.random() * 100);
            repetido = false;
            for (int i = 0 ; i < AJ.length ; i++) {
                if (AJ[i] == numAleatorio) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                AJ[cont] = numAleatorio;
                cont++;
            }
        }
        Arrays.sort(AJ);
        cont = 1;
        System.out.println("Você tem 10 tentativas para acertar um elemento do vetor AJ!");
        while (cont <= 10) {
            System.out.print("Seu " + (cont) + " palpite: ");
            palpite = scanner.nextInt();
            for (int i = 0 ; i < AJ.length ; i++) {
                if (palpite == AJ[i]) {
                    System.out.print("\tVocê acertou!\n\tVetor AJ: ");
                    for (int valor : AJ) {
                        System.out.print(valor + " ");
                    }
                    System.out.print("\n\tPosição do elemento acertado: " + i);
                    System.exit(0);
                }
            }
            System.out.println("\tERROU!");
            cont++;
        }
        System.out.println("Você não acertou nenhum elemento do vetor AJ!");
    }
}

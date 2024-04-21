/*30) Escreva um programa para gerar um vetor de double AK de dimensão e
        elementos definidos pelo usuário. Ordenar de forma crescente. Criar um
        vetor AL, tal que, este receba os elementos do vetor AK com a média entre
        cada dois elementos.
        Ex:
        Quantidade de elementos do vetor AK: 5
        Vetor AK [ 8.2, 10.0, 2.0, 6.0, 4.0 ]
        (vetor original - 5 elementos)
        Vetor AK [ 2.0, 4.0, 6.0, 8.2, 10.0 ]
        (vetor ordenado - 5 elementos)
        Vetor AL [ 2.0, 3.0, 4.0, 5.0, 6.0, 7.1, 8.2, 9.1, 10.0 ]
        (vetor com as médias - 9 elementos*/

import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] AK, AL;
        System.out.println("Informe a quantidade de elementos do vetor AK: ");
        AK = new double[scanner.nextInt()];
        for (int i = 0 ; i < AK.length ; i++) {
            System.out.println("Informe o " + (i + 1) + " elemento do vetor AK: ");
            AK[i] = scanner.nextDouble();
        }
        Arrays.sort(AK);

        AL = new double[AK.length * 2 - 1];
        for (int i = 0 ; i < AK.length - 1 ; i++) {
            AL[i * 2] = AK[i];
            AL[i * 2 + 1] = (AK[i] + AK[i + 1]) / 2;
        }
        AL[AL.length - 1] = AK[AK.length - 1];

        System.out.println("Vetor AK: " + Arrays.toString(AK));
        System.out.println("Vetor AL: " + Arrays.toString(AL));
    }
}

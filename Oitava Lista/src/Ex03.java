/*3) Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a
        20 e imprimir seus elementos. O usuário deve informar o número de posições e os
        elementos.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de posições do vetor, menor ou igual a 20: ");
        int[] C = new int[scanner.nextInt()];

        for (int i = 0 ; i < C.length ; i++) {
            C[i] = (1 + i);
            System.out.print(C[i] + " ");
        }
    }
}
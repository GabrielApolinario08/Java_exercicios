/*22) Escreva um programa para ler um vetor AC de N posições, onde N é
        menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
        número de posições e um número máximo para o tamanho dos elementos. O
        programa deve validar a entrada dos dados e imprimir o vetor ao final.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AC;
        int valorMax = 0;
        do {
            System.out.println("Informe a quantidade de elementos: [<=20]");
            AC = new int[scanner.nextInt()];
            if (AC.length <= 20) {
                System.out.println("Informe o valor máximo dos elementos: ");
                valorMax = scanner.nextInt();
            }
        } while (AC.length > 20);

        System.out.print("Vetor AC: ");
        for (int i = 0 ; i < AC.length ; i++) {
            AC[i] = (int)(Math.random() * valorMax) + 1;
            System.out.print(AC[i] + " ");
        }
    }
}

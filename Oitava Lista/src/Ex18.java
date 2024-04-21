/*18) Escreva um programa para solicitar ao usuário a quantidade de
        elementos da sequência de Fatoriais (N<=15) e gerar um vetor Y com os
        elementos da sequência e imprimir o vetor.*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Y;
        int j = 1;
        do {
            System.out.println("Informe a quatidade de elementos da sequência de fatoriais: (<=15)");
            Y = new int[scanner.nextInt()];
        } while (Y.length > 15);

        for (int i = 0 ; i < Y.length ; i++)  {
            Y[i] = fatorial(j);
            j++;
        }

        System.out.print("Vetor Y: ");
        for (int i : Y) {
            System.out.print(i + " ");
        }
    }

    public static int fatorial(int num) {
        int resultado = 1;
        for (int i = num ; i >= 1 ; i--) {
            resultado *= i;
        }
        return resultado;
    }
}

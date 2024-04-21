/*16) Escreva um programa para solicitar ao usuário a quantidade de
        elementos da sequência de Fibonacci (N<=20) e gerar um vetor V com os
        elementos da sequência e imprimir o vetor.*/


import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de elementos da sequência de Fibonacci: (<=20)");
        int[] V = new int[scanner.nextInt()];
        if (V.length <= 20) {
            int n1 = 0, n2 = 1, n3 = 1;
            for (int i = 0 ; i < V.length ; i++) {
                V[i] = n1;
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
            System.out.print("Vetor com a sequência de Fibonacci: ");
            for (int valor : V) {
                System.out.print(valor + " ");
            }
        } else  {
            System.out.println("Informe um valor menor ou igual a 20!");
        }

    }
}

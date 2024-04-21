/* 4) Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
e N (inclusive). Considere que o N será sempre maior que ZERO. */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um valor maior que zero: ");
        int n = scanner.nextInt();

        if(n <= 0) {
            System.out.println("Forneça um valor válido!");
        } else {
            int cont = 1;
            while (cont <= n) {
                System.out.println("Contagem: " + cont);
                cont++;
            }
        }
    }
}

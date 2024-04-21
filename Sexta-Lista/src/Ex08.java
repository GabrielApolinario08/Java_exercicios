/* 8) Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são
NEGATIVOS. */

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdNegativos = 0;

        int cont = 1;
        while (cont <= 10) {
            System.out.printf("Informe o %d° valor: ", cont);
            int num = scanner.nextInt();
            if (num < 0) {
                qtdNegativos += 1;
            }
            cont++;
        }

        System.out.printf("Quantidade de valores negativos identificados: %d", qtdNegativos);
    }
}

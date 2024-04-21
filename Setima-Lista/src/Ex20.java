/*20) Escreva um programa que receba uma frase, conte e imprima o número de palavras desta
        frase.*/

import java.util.Scanner;
import java.util.Arrays;

// Gabriel Apolinário Fabrício
public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        System.out.println("Quantidade de palavras da frase: " + palavras.length);
    }
}

/*5) Escreva um programa que calcule e escreva a quantidade de vezes que o
        caractere ‘a’ aparece em uma frase fornecida pelo usuário. Nota Importante: para a
        contagem, o caractere pode ser maiúsculo ou minúsculo*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Forneça uma frase: ");
        String frase = scanner.nextLine();
        int cont = 0;
        frase = frase.toLowerCase();
        for (int i = 0 ; i < frase.length() ; i++) {
            if (frase.charAt(i) == 'a') {
                cont++;
            }
        }
        System.out.println("Quantidade de vezes que a letra A ou a aparece na frase: " + cont);
    }
}
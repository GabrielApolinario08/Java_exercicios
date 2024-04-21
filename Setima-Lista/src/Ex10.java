/*10) Escreva um programa que calcule e escreva a quantidade de letras maiúsculas de uma
        frase fornecida pelo usuário.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        int quantidade = 0;
        for (int i = 0 ; i < frase.length() ; i++) {
            for (char cont = 'A' ; cont <= 'Z' ; cont++) {
                if (frase.charAt(i) == cont) {
                    quantidade++;
                }
            }
        }
        System.out.println("Quantidade de letras maiúsculas contidas na frase: " + quantidade);
    }
}

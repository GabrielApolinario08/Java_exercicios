/*11) Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres
        alfabéticos e de dígitos numéricos existentes em uma frase fornecida pelo usuário.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();
        int contagem = 0;
        System.out.println("CONTAGEM DE CARACTERES ALFABÉTICOS!");
        for (char i = 'a';i <= 'z'; i++) {
            for (int cont = 0 ; cont < frase.length() ; cont++) {
                if (frase.charAt(cont) == i) {
                    contagem++;
                }
            }
            System.out.printf("%c - %d\n", i, contagem);
            contagem = 0;

        }
        System.out.println("CONTAGEM DE CARACTERES NUMÉRICOS!");
        for (char i = '0';i <= '9'; i++) {
            for (int cont = 0 ; cont < frase.length() ; cont++) {
                if (frase.charAt(cont) == i) {
                    contagem++;
                }
            }
            System.out.printf("%c - %d\n", i, contagem);
            contagem = 0;
        }

    }
}

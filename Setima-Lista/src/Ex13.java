/*13) Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo
        usuário.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        int contagem = 0;
        for (char i = 'b'; i <= 'z' ; i++) {
            if (i != 'e' && i != 'i' && i != 'o' && i != 'u' && i != 'h' && i != 'y') {
                for (int cont = 0 ; cont < frase.length() ; cont++) {
                    if (i == frase.charAt(cont)) {
                        contagem++;
                    }
                }
                System.out.println(Character.toUpperCase(i) + " - " + contagem);
                contagem = 0;
            }

        }
    }
}

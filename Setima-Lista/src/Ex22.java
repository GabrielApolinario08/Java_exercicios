/*22) Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes
        que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, a
        palavra ANA ocorre 4 vezes.*/

import java.util.Locale;
import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase(), palavraNaFrase = "";

        int ocorrencias = 0;
        for (int i = 0 ; i < frase.length() ; i++) {
            if (palavraNaFrase.length() < palavra.length()) {
                palavraNaFrase += frase.charAt(i);
            }
        }

        for (int i = 0 ; i < frase.length() ; i++) {
            if (palavraNaFrase.equals(palavra)) {
                ocorrencias++;
            }
            if (palavraNaFrase.length() == frase.length() - i) {
                break;

            }

            palavraNaFrase += frase.charAt(palavraNaFrase.length() + i);
            palavraNaFrase = palavraNaFrase.substring(1);
        }
        System.out.println("Na frase: '" + frase + "' a palavra " + palavra + " ocorre " + ocorrencias + " vezes.");
    }
}

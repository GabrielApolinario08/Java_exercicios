/*28) Escreva um programa que leia uma String e “dobre” ela ao meio concatenado seus
        caracteres.
        Ex:
        Entrada: Macaco Caco quer banana (tamanho ímpar)
        Saída: Maancaancaob rCeaucqo
        Entrada: Batatinha quando nasce (tamanho par)
        Saída: Beactsaatniondhnaa uq*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine(), primeiraMetade = "", segundaMetade = "";
        int ultimoTermo = frase.length() - 1, metade;
        if (frase.length() % 2 == 0) {
            metade = frase.length() / 2;
            for (int i = 0 ; i < metade ; i++) {
                primeiraMetade += frase.charAt(i);
            }
            for (int i = frase.length() - 1 ; i >= metade ; i--) {
                segundaMetade += frase.charAt(i);
            }
            for (int i = 0 ; i < metade ; i++) {
                System.out.printf("%c%c", primeiraMetade.charAt(i), segundaMetade.charAt(i));
            }
        } else {
            metade = ((frase.length() - 1) / 2) + 1;
            for (int i = 0 ; i <= metade - 1 ; i++) {
                primeiraMetade += frase.charAt(i);
            }
            for (int i = frase.length() - 1 ; i > metade - 1 ; i--) {
                segundaMetade += frase.charAt(i);
            }
            System.out.println(primeiraMetade);
            System.out.println(segundaMetade);
            for (int i = 0 ; i < metade ; i++) {
                if (i == metade) {
                    System.out.printf("%c", primeiraMetade.charAt(i));
                } else {
                    System.out.printf("%c%c", primeiraMetade.charAt(i), segundaMetade.charAt(i));
                }
            }
        }
    }
}

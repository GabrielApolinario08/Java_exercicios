/*19) Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a
        palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan,
        sos, arara, etc).*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma cadeia de caracteres: ");
        String palavra = scanner.nextLine();
        String palavraAoContrario = "";
        for (int i = (palavra.length() - 1) ; i >= 0 ; i--) {
            palavraAoContrario += palavra.charAt(i);
        }
        if (palavra.equals(palavraAoContrario)) {
            System.out.println("A palavra é um palíndromo!");
        } else {
            System.out.println("A palavra não é um palíndromo!");
        }
    }
}

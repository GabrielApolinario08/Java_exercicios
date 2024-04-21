/*21) Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma
        linha.*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}

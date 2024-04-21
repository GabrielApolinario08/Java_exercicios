/*16) Escreva um programa que informe se todos os caracteres alfabéticos de uma frase
        fornecida pelo usuário são maiúsculos.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma frase: ");
        String frase = scanner.nextLine();
        boolean isMaiusc = true;
        for (int i = 0 ; i < frase.length() ; i++) {
            char letra = frase.charAt(i);
            letra = Character.toUpperCase(letra);
            if (frase.charAt(i) != letra) {
                isMaiusc = false;
                break;
            }
        }
        if (isMaiusc) {
            System.out.println("TODAS AS LETRAS SÃO MAIÚSCULAS!");
        } else {
            System.out.println("TODAS AS LETRAS NÃO SÃO MAIÚSCULAS!");
        }
    }
}

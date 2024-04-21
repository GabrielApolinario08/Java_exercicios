/*27) Escreva um programa para solicitar ao usuário duas Strings. Se forem de mesmo tamanho,
        concatenar seus caracteres, caso contrário, informar ao usuário.
        Ex:
        Entrada 1: banana
        Entrada 2: uva
        Saída: Erro! Entradas de tamanhos diferentes.

        Entrada 1: bananas
        Entrada 2: pitanga
        Saída: bpaintaannagsa*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str01 = scanner.nextLine();
        System.out.println("Digite outra string do mesmo tamanho da primeira: ");
        String str02 = scanner.nextLine();

        if (str01.length() != str02.length()) {
            System.out.println("Erro! Entradas de tamanhos diferentes.");
            System.exit(0);
        }
        System.out.print("Resultado: ");
        for (int i = 0 ; i < str01.length() ; i++) {
            System.out.printf("%c", str01.charAt(i));
            System.out.printf("%c", str02.charAt(i));
        }
    }
}

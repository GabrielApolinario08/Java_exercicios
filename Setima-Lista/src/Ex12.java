/*12) Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em
        uma frase fornecida pelo usuário.*/

import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex12 {
    public static void main(String[] args) {
        int a, e, i, o, u;
        a = e = i = o = u = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();
        for (int cont = 0 ; cont < frase.length() ; cont++) {
            switch (frase.charAt(cont)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
    }
}
